import java.util.Scanner;

public class Bodmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Val1");
        int Val1 = sc.nextInt();

        System.out.println("Enter The Val2");
        int Val2 = sc.nextInt();

        int div = Val1 / Val2;
        int multiply = Val1 * Val2;
        int add = multiply + Val1 + Val2;
        int sub = add - Val1 - Val2;

        System.out.println(Val1 / Val2);
        System.out.println(Val1 * Val2);
        System.out.println(multiply + Val1 + Val2);
        System.out.println(add - Val1 - Val2);

    }

}