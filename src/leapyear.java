import java.util.Scanner;
public class leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Year");
        int y = sc.nextInt();

        if(y % 100 == 0 && y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
            System.out.println("It is leap year");
        }
        else {
            System.out.println("It is Not a leap year");
        }
    }
}
