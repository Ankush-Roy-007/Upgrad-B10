import java.util.Scanner;
public class driving {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Age:");
        int a = sc.nextInt();

        if(a > 18){
            System.out.println("eligible to drive");
        }
        else if(a < 18){
            System.out.println("not eligible to drive");
        }
        else{
            System.out.println("Hello");
        }
    }
}
