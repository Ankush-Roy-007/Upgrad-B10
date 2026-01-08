
import java.util.Scanner;

public class compare {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Numbers");
        int a = sc.nextInt();
        System.out.println("Enter Second Numbers");
        int b = sc.nextInt();
        if(a>b) {
            int sum = a + b;
            System.out.println("Addition" + sum);
        }
        else {
            if(a > 0 && b > 0){
                int sum = a -b;
                System.out.println("Sub" + sum);

            }
            else {
                System.out.println("do Not run operation");
            }


        }

        }

    }

