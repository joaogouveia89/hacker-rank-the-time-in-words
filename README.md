# Halloween Sale - Hacker Rank platform problem
Solutions in Java, Kotlin and Ruby

Given the time in numerals we may convert it into words, as shown below:

5:00 -> five o'clock<br />
5:01 -> one minute past five<br />
5:10 -> ten minutes past five<br />
5:15 -> quarter past five<br />
5:30 -> half past fivev
5:40 -> twenty minutes to six<br />
5:45 -> quarter to six<br />
5:47 -> thirteen minutes to six<br />
5:28 -> twenty eight minutes past five<br />

At ***minutes = 0***, use o'clock. For ***1 <= minutes <= 30***, use past, and for ***30 < minutes *** use to. Note the space between the apostrophe and clock in o' clock. Write a program which prints the time in words for the input given in the format described.


### Function Description

Complete the timeInWords function in the editor below.

timeInWords has the following parameter(s):

* int h: the hour of the day
* int m: the minutes after the hour

### Returns
* string: a time string as described

### Input Format

The first line contains ***h***, the hours portion The second line contains ***m***, the minutes portion

### Constraints
* 1 <= h <= p <= 12
* 0 <= d <= 60