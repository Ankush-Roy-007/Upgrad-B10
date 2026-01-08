import java.util.Scanner;
public class marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The number");
        int a = sc.nextInt();

        if (a>80){
            System.out.println("Your Grade is A");
        }
        else if(a<80){
            System.out.println("Your Grade is B");
        }
        else{
            System.out.println("You Are Fail");
        }
    }
}
