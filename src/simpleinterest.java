import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Principal Amt");
        int p = sc.nextInt();
        System.out.println("Enter The rate of interest");
        int r = sc.nextInt();
        System.out.println("Enter The Time");
        int t = sc.nextInt();

        int simpleinterest = p * r * t/100;

        System.out.println("Simple Interest is" + simpleinterest);
    }
}
