package production.upgradClass;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class librarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate today = LocalDate.now();
//        String today = ld.toString();
//        System.out.println(today);

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/dd/MM");
//        String format = ld.format(dtf);
//        System.out.println(format);
        System.out.print("enter date issued book : ");
        String date = sc.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate curdate = LocalDate.parse(date,formatter);
        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);
        long daysBetween = ChronoUnit.DAYS.between(curdate, today);
        System.out.println(daysBetween);
        int fine = (int)daysBetween/7;

      //  for(int i = 1; i<=fine;i++){
            System.out.println("you get finned rupees :"+(50*fine));
      //  }



    }
}
