import java.util.Scanner;

public class BODMAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num: " );
        int a = sc.nextInt();
        System.out.println("enter second num: " );
        int b = sc.nextInt();
        int div = a/b;
        int mul = a*b;
        int add = div+mul;
        int sub = add - (a+b);
        System.out.println("divison : "+div);
        System.out.println("mul : "+mul);
        System.out.println("add : "+add);
        System.out.println("sub : "+sub);
    }
}
