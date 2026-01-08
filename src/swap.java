import java.util.Scanner;
public class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Numbers");
        int a = sc.nextInt();
        System.out.println("Enter Second Numbers");
        int b = sc.nextInt();

        System.out.println("first number" + a);
        System.out.println("second number" + b);

        a = a + b;
        b = a - b;
        a = a- b ;

        System.out.println("After Swapping Numbers");
        System.out.println("First Number is" + a);
        System.out.println("Second Number is" + b);
    }
}
