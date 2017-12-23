# Leap Year
Here are two different ways to see if a year is a leap year or not. In the `LeapYear.java` program, you input the year in the program. But that can take some, so the `Year.java` allows you to run the year as input in the terminal.
Both programs use a simple algorithm to distinguish if the year is a leap year. The rules it follows are either if it's (a) divisible by 400 or (b) divisible by 4 and not 100.

### `LeapYear`
First, input the year you'd like to check & save the file. Then to run, type in `java LeapYear` in the terminal.
In it's current state, it will read `1959 is not a leap year.`

### `Year`
This file is slightly more complicated because it takes in a command line argument. But ultimately, it does the same thing. The number that is inputed is put through the same if statement to see if year works out mathmatically to be a leap year. To run this, type in `java Year [year]`, replacing `[year]` with whatever year you'd like to test out.
