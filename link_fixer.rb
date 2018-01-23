#!/usr/bin/env ruby

ROOT_INPUT_PATH = "#{File.dirname(__FILE__)}/mediawiki_wiki"
SINGLE_EXAMPLE_FILE_PATH = "#{ROOT_INPUT_PATH}/RDF_Application_Profiles.md"
REGEX_FOR_ALL_LINKS = /([("]?)(\/mediawiki_wiki\/[^)"]+)([)"]?)/
REGEX_FOR_URL_WITH_FILE_EXTENSION_OR_FORWARD_SLASH = /(\.[A-Za-z]{2,4}|\/)[)"]$/
LOG_PATH = "/Users/paulwalk/_temp/mediawiki_logs/"

$urls_not_changed = []
$urls_changed = []
$files_not_processed = []

def do_replacement(input_string)
	m = input_string.match(REGEX_FOR_URL_WITH_FILE_EXTENSION_OR_FORWARD_SLASH)
	if m then
		$urls_not_changed << input_string
		return input_string
	else
		$urls_changed << input_string
		return input_string.gsub(REGEX_FOR_ALL_LINKS,'\1\2.md\3')
	end
end

def process_file(path)
	begin
		text = File.read(path)
		text.gsub!(REGEX_FOR_ALL_LINKS) {|m| do_replacement(m)}
		File.open(path, 'w') { |file| file.write(text) }
	rescue Exception => e
		$files_not_processed << path
		puts e.message
	end	
end

Dir.glob("#{ROOT_INPUT_PATH}/**").each do |path|
	process_file(path)
end

# process_file(SINGLE_EXAMPLE_FILE_PATH)

File.open("#{LOG_PATH}/urls_not_changed.log", "w") do |f|
  $urls_not_changed.each { |url| f.puts(url) }
end

File.open("#{LOG_PATH}/urls_changed.log", "w") do |f|
  $urls_changed.each { |url| f.puts(url) }
end

File.open("#{LOG_PATH}/files_not_processed.log", "w") do |f|
  $files_not_processed.each { |path| f.puts(path) }
end