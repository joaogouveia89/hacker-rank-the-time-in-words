require 'colorize'
require './time_in_minutes'

#input parsing and reading

input_files = Dir.entries("../../test-cases/input")


start = Time.now
input_files.each do |input_file|
	unless input_file === "." || input_file === ".." 
		input = File.open("../../test-cases/input/" + input_file)
		data = input.map(&:chomp)

		h = data[0].to_i
		m = data[1].to_i

		response = time_in_minutes h, m

		output_number = input_file[/input(.*?)\.txt/m, 1]

		output_file = File.open("../../test-cases/output/output" + output_number + ".txt")

		data = output_file.map(&:chomp)
		output = data[0]

		if response === output
			puts ("INPUT " + output_number.to_s).green
		else
			puts ("INPUT " + output_number.to_s).red
			puts("response = " + response)
		end
	end
end