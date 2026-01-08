import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class book {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Enter Date");
        String dateInput = input.next();

        System.out.println(dt.toLocaleString());
        System.out.println(dt.getDate() + "-" + dt.getMonth() + "-" + dt.getYear());
        int date = input.nextInt();
        int a = 54;
        String dummy = String.valueOf(a);
        System.out.println(dummy.getClass());

        String sample = "34";
        Integer dummy3 = Integer.parseInt(sample);
        System.out.println(dummy3.getClass());

        System.out.println("Formatted Date:");
        System.out.println(sdf.format(dt));



    }

}