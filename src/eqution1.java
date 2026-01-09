import java.util.Scanner;

public class eqution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(1/2f);
        System.out.println("enter time :");
        int t = sc.nextInt();
        System.out.println("initial speed :");
        int u = sc.nextInt();
        System.out.println("acceleration :");
        int a = sc.nextInt();
        double s = (u*t)+(1*a*t*t/2);
        System.out.println(s);
    }
}
