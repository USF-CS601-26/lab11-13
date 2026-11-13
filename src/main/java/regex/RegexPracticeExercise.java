package regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPracticeExercise {

    /**
     * Open a given input file in the following format (see resources/input.txt):
     Janet Smith 401-987-3456
     Hao Chen	415-416-6825
     Katherine Tucto 510a-901-123
     Priya Ram 625-891-1467
     Alex van Damm 800-256-8368

     Extract valid phone numbers / last names and output to the output file in the following format:
     Smith: 401-987-3456
     Chen: 415-416-6825
     Ram: 625-891-1467
     van Damm: 800-256-8368
     * @param inputFilename
     * @param output
     */
    public static void extractValidPhoneAndLastName(String inputFilename, String output) {
        try(BufferedReader br = new BufferedReader(new FileReader(inputFilename));
            PrintWriter pw = new PrintWriter(output)) {
            String line;
            while ((line = br.readLine()) != null) {
                // Janet Smith 401-987-3456
                // TODO:
                // Compile the pattern (come up with the regex that uses groups to match the name and the phone number)
                // Create a matcher for the pattern
                // Apply the pattern to the line, extract last name and phone and write them to the output file using pw

            }
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }

    static void main(String[] args) {
        extractValidPhoneAndLastName("src/main/resources/input.txt", "output.txt");
    }
}
