def number_to_word n
	words = ["one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen"]
	word = if (n == 15 || n == 45)
		"quarter"
	elsif n == 30
		"half"
	elsif n > 13 && n < 20
		nw = number_to_word n/10
		nw.split('').last === 't' ? nw + "een" : "teen"
		nw
	elsif n == 20
		"twenty"
	elsif n > 20 && n < 30
		"twenty " + number_to_word(n % 10)
	else
		words[n - 1]
	end
end

def time_in_minutes h, m
	# as h is never 0(according to the constraints, I will not handle this case)
	if m == 0
		return number_to_word(h) + " o' clock"
	elsif m <= 30
		min_word = number_to_word(m)
		unless min_word === "quarter" || min_word === "half"
			min_word = if(m === 1)
				min_word + " minute"
			else
				min_word + " minutes"
			end
		end
		return min_word + " past " + number_to_word(h)
	else
		min_word = number_to_word(60 - m)
		unless min_word === "quarter"
			min_word = min_word + " minutes"
		end
		return min_word + " to " + number_to_word(h + 1)
	end
end