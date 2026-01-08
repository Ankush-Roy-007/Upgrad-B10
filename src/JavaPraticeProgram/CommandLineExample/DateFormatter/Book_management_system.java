package JavaPraticeProgram.CommandLineExample.lecture5;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Book_management_system {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String formattedDate = currentDate.format(formatter);
//        System.out.println("Current Date in dd-MM-yyyy format: " + formattedDate);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book issue date ");
        String issueDate = sc.next();

        DateTimeFormatter issueDateFormatter =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate issueDateFormatte = LocalDate.parse(issueDate,issueDateFormatter);

        System.out.println("Enter book return date ");
        String returnDate = sc.next();

        DateTimeFormatter returnDateFormatter =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate returnDateFormatte = LocalDate.parse(returnDate,returnDateFormatter);


        long difference = ChronoUnit.DAYS.between(issueDateFormatte , returnDateFormatte);
        System.out.println("Difference"+difference+"days");

        int fine =(int) (difference/7)*50;

        System.out.println("Total Fine:$"+fine);



    }
}
