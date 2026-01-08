import java.util.Scanner;

public class equation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(1/2f);
        System.out.println("enter time:");
        int t = sc.nextInt();
        System.out.println("intial speed");
        int v = sc.nextInt();
        System.out.println("acceleration:");
        int a = sc.nextInt();
        double s = (v*t)+(1*a*t*t/2);
        System.out.println(s);
    }

}
