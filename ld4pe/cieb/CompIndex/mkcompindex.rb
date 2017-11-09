#!/usr/bin/env ruby

require 'optparse'

options = {}
option_parser = OptionParser.new do |opts|

  opts.on("--source SOURCEFILE") do |source|
    options[:source] = source
  end

  opts.on("--target TARGETFILE") do |target|
    options[:target] = target
  end

end

option_parser.parse!
puts "generating #{options[:target]} from #{options[:source]}"

now = Time.now.strftime("%Y-%m-%d")
input  = options[:source]
output = options[:target]

header = %(
# LD4PE Competency Index

#{now}

* generated [Compindex-generated.md](https://github.com/ld4pe/cieb/blob/master/CompIndex/CompIndex-generated.md) from [Compindex.txt](https://github.com/ld4pe/cieb/blob/master/CompIndex/CompIndex.txt)
* converted [Compindex-generated.md](https://github.com/ld4pe/cieb/blob/master/CompIndex/CompIndex-generated.md) into GDOC (via DOCX) for collecting comments
* see latest published version at [http://explore.dublincore.net/comp-index/](http://explore.dublincore.net/comp-index/) (may be out-of-date)\n

-----------------------------------\n
### Topic cluster
   * Topic
      * Competency: Tweet-length assertion of knowledge, skill, or habit of mind
         * Benchmark: Action demonstrating accomplishment in related competencies\n
-----------------------------------\n
)

ci_raw = IO.readlines(input)
File.open(output, 'w') do |file|
  file.write(header)
  ci_raw.each do |line| 
    case line
    when /^A/
      file.write("\n### #{line[2..-1]}\n")
    when /^B/
      file.write("   * #{line[2..-1]}")
    when /^C/
      file.write("      * #{line[2..-1]}")
    when /^D/
      file.write("         * #{line[2..-1]}")
    end
  end
end

