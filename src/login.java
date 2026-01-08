import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = "Prasanna@1234";
        String password = "admin@123";
        String correctuserName = "Prasanna@1234";
        String correctpassword = "admin@123";

        System.out.println("Enter Username");
        String u = sc.nextLine();
        System.out.println("Enter Password");
        String p = sc.nextLine();

        if(userName.equals(correctuserName) && password.equals(correctpassword)){
            System.out.println("Sucessfull Login");
        }
            else{
                System.out.println("Invalid Login");
        }



    }
}