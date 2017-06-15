; bind a key sequence
(global-set-key "\C-xt" 'tidy-region)

; define an error buffer
(setq shell-command-default-error-buffer "tidy-errors") 

; Function to run Tidy HTML parser on region 
; NOTE: this requires external Tidy program
(defun tidy-region ()
  "Run Tidy HTML parser on current region."
  (interactive)
  (let ((START (mark))
        (END (point))
        (COMMAND "tidy -i "))
        (save-excursion
        (myshell-command-on-region START END COMMAND t t shell-command-default-error-buffer)))


(defun myshell-command-on-region (start end command
				      &optional output-buffer replace
				      error-buffer)
  "Execute string COMMAND in inferior shell with region as input.
Normally display output (if any) in temp buffer `*Shell Command Output*';
Prefix arg means replace the region with it.  Return the exit code of
COMMAND.

To specify a coding system for converting non-ASCII characters
in the input and output to the shell command, use \\[universal-coding-system-argument]
before this command.  By default, the input (from the current buffer)
is encoded in the same coding system that will be used to save the file,
`buffer-file-coding-system'.  If the output is going to replace the region,
then it is decoded from that same coding system.

The noninteractive arguments are START, END, COMMAND, OUTPUT-BUFFER,
REPLACE, ERROR-BUFFER.  Noninteractive callers can specify coding
systems by binding `coding-system-for-read' and
`coding-system-for-write'.

If the output is one line, it is displayed in the echo area,
but it is nonetheless available in buffer `*Shell Command Output*'
even though that buffer is not automatically displayed.
If there is no output, or if output is inserted in the current buffer,
then `*Shell Command Output*' is deleted.

If the optional fourth argument OUTPUT-BUFFER is non-nil,
that says to put the output in some other buffer.
If OUTPUT-BUFFER is a buffer or buffer name, put the output there.
If OUTPUT-BUFFER is not a buffer and not nil,
insert output in the current buffer.
In either case, the output is inserted after point (leaving mark after it).

If REPLACE, the optional fifth argument, is non-nil, that means insert
the output in place of text from START to END, putting point and mark
around it.

If optional sixth argument ERROR-BUFFER is non-nil, it is a buffer
or buffer name to which to direct the command's standard error output.
If it is nil, error output is mingled with regular output.
In an interactive call, the variable `shell-command-default-error-buffer'
specifies the value of ERROR-BUFFER."
  (interactive (let ((string
		      ;; Do this before calling region-beginning
		      ;; and region-end, in case subprocess output
		      ;; relocates them while we are in the minibuffer.
		      (read-from-minibuffer "Shell command on region: "
					    nil nil nil
					    'shell-command-history)))
		 ;; call-interactively recognizes region-beginning and
		 ;; region-end specially, leaving them in the history.
		 (list (region-beginning) (region-end)
		       string
		       current-prefix-arg
		       current-prefix-arg
		       shell-command-default-error-buffer)))
  (let ((error-file
	 (if error-buffer 

;;; the following is a hack to make this work for UNIX.
	     (concat (file-name-directory "/tmp/emacsXXXXXX")
		     (make-temp-name "scor"))
	   nil))
	exit-status)
    (if (or replace
	    (and output-buffer
		 (not (or (bufferp output-buffer) (stringp output-buffer)))))
	;; Replace specified region with output from command.
	(let ((swap (and replace (< start end))))
	  ;; Don't muck with mark unless REPLACE says we should.
	  (goto-char start)
	  (and replace (push-mark))
	  (setq exit-status
		(call-process-region start end shell-file-name t
				     (if error-file
					 (list t error-file)
				       t)
				     nil shell-command-switch command))
	  (let ((shell-buffer (get-buffer "*Shell Command Output*")))
	    (and shell-buffer (not (eq shell-buffer (current-buffer)))
		 (kill-buffer shell-buffer)))
	  ;; Don't muck with mark unless REPLACE says we should.
	  (and replace swap (exchange-point-and-mark)))
      ;; No prefix argument: put the output in a temp buffer,
      ;; replacing its entire contents.
      (let ((buffer (get-buffer-create
		     (or output-buffer "*Shell Command Output*")))
	    (success nil))
	(unwind-protect
	    (if (eq buffer (current-buffer))
		;; If the input is the same buffer as the output,
		;; delete everything but the specified region,
		;; then replace that region with the output.
		(progn (setq buffer-read-only nil)
		       (delete-region (max start end) (point-max))
		       (delete-region (point-min) (min start end))
		       (setq exit-status
			     (call-process-region (point-min) (point-max)
						  shell-file-name t 
						  (if error-file
						      (list t error-file)
						    t)
						  nil shell-command-switch
						  command)))
	      ;; Clear the output buffer, then run the command with
	      ;; output there.
	      (save-excursion
		(set-buffer buffer)
		(setq buffer-read-only nil)
		(erase-buffer))
	      (setq exit-status
		    (call-process-region start end shell-file-name nil
					 (if error-file
					     (list buffer error-file)
					   buffer)
					 nil shell-command-switch command)))
	  (setq success (and exit-status (equal 0 exit-status)))
	  ;; Report the amount of output.
	  (let ((lines (save-excursion
			 (set-buffer buffer)
			 (if (= (buffer-size) 0)
			     0
			   (count-lines (point-min) (point-max))))))
	    (cond ((= lines 0)
		   (if (and error-file
			    (< 0 (nth 7 (file-attributes error-file))))
		       (message "(Shell command %sed with some error output)"
				(if (equal 0 exit-status)
				    "succeed"
				  "fail"))
		     (message "(Shell command %sed with no output)"
			      (if (equal 0 exit-status)
				  "succeed"
				"fail")))
		   (kill-buffer buffer))
		  ((= lines 1)
		   (message "%s"
			    (save-excursion
			      (set-buffer buffer)
			      (goto-char (point-min))
			      (buffer-substring (point)
						(progn (end-of-line) (point))))))
		  (t 
		   (save-excursion
		     (set-buffer buffer)
		     (goto-char (point-min)))
		   (display-buffer buffer)))))))
    (when (and error-file (file-exists-p error-file))
      (if (< 0 (nth 7 (file-attributes error-file)))
	  (with-current-buffer (get-buffer-create error-buffer)
	    (let ((pos-from-end (- (point-max) (point))))
	      (or (bobp)
		  (insert "\f\n"))
	      ;; Do no formatting while reading error file,
	      ;; because that can run a shell command, and we
	      ;; don't want that to cause an infinite recursion.
	      (format-insert-file error-file nil)
	      ;; Put point after the inserted errors.
	      (goto-char (- (point-max) pos-from-end)))
	    (display-buffer (current-buffer))))
      (delete-file error-file))
    exit-status))
       
;(defun shell-command-to-string (command)
;  "Execute shell command COMMAND and return its output as a string."
;  (with-output-to-string
;    (with-current-buffer
;      standard-output
;      (call-process shell-file-name nil t nil shell-command-switch command))))

; Kill other window and and enlarge current buffer
(global-set-key [f8] 'kill-buffer-other-window) 
(defun kill-buffer-other-window (arg)
  "Kill the buffer in the other window, and make the current buffer full size. If no other window, kills current buffer."
  (interactive "p")
  (let ((buf (save-window-excursion
               (other-window arg)
               (current-buffer))))
    (delete-windows-on buf)
    (kill-buffer buf))  )
