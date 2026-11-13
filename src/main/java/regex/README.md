RegexPracticeExercise reads a text file, where each line contains:
a first name, a last name, and a phone number, separated by whitespace.

The input file src/main/resources/input.txt contains:

Janet Smith 401-987-3456
Hao Chen   415-416-6825
Katherine Tucto 510a-901-123
Priya Ram 625-891-1467
Alex van Damm 800-256-8368

Your task is to complete the extractValidPhoneAndLastName method to extract last names and valid phone numbers using a regular expression.

A valid phone number must have the format XXX-XXX-XXXX, where each X is a digit.

Note that:
- There may be multiple spaces between the name and phone number.
- A last name may contain spaces, such as van Damm.
- Some phone numbers may be invalid. Skip those lines.

Complete the TODO section in RegexPracticeExercise.java:

Create a regular expression that matches the first name, last name, and phone number. Use capturing groups for the last name and phone number.

Compile the regular expression using Pattern.compile().

Create a Matcher for each line of the input file.

Use find() to check whether the line contains a match.

If a match is found, use group() to extract the last name and phone number.

Write the last name and phone number to the output file using PrintWriter.

Hint: You may find \\s+, [A-Za-z], and \\d{3} useful when constructing your regular expression.

After running the program, the file output.txt should contain:

Smith: 401-987-3456
Chen: 415-416-6825
Ram: 625-891-1467
van Damm: 800-256-8368

The line containing Katherine Tucto should be skipped because the phone number is invalid.

Testing

Run the main method in RegexPracticeExercise.java, then open output.txt and verify that it shows the expected output.