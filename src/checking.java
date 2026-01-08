import java.util.Scanner;
public class checking {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int a = sc.nextInt();

        if(a > 0){
            System.out.println("The Number Is postive");
        }
        else if(a < 0){
            System.out.println("The Number is Negtive");
        }
        else {
            System.out.println("The number is zero");
        }
    }
}
