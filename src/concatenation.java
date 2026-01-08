import java.util.Scanner;
public class concatenation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String n = sc.nextLine();

        System.out.println("Enter Your Hobby");
        String h = sc.nextLine();

        System.out.println("Hello!" + n + "Your favorite hobby is:" + h);

    }
}
