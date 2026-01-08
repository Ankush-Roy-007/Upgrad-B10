import java.util.Scanner;
public class reverseinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The number");
        int a = sc.nextInt();
        int revNum = 0;
        while (a != 0) {
            int digit = a % 10;
            revNum = revNum * 10 + digit;
            a /= 10;
        }
        System.out.println("Reversed number: " + revNum);
    }

    }
