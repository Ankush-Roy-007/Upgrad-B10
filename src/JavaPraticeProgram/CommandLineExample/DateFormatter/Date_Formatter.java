package JavaPraticeProgram.CommandLineExample.lecture5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Formatter {
    public static void main(String[] args) {
        // 1. Get the current date as a LocalDate object
        LocalDate currentDate = LocalDate.now();

        // 2. Define the desired format using DateTimeFormatter
        // Use "MM" for the month (case sensitive) to avoid using "mm" which is for minutes
        // Use "yyyy" or "uuuu" for the year
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // 3. Format the LocalDate object into a String
        String formattedDate = currentDate.format(formatter);

        // 4. Print the result
        System.out.println("Current Date in dd-MM-yyyy format: " + formattedDate);
    }
}
