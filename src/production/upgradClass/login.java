package production.upgradClass;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = "viki";
        String password = "98765";
        String user = sc.nextLine();
        String pass = sc.nextLine();
        if(userName.equals(user)){
            if(password.equals(pass)){
                System.out.println("access granted");
            }
            else {
                System.out.println("password is incorrect");
            }
        }
        else{
            System.out.println("access denied ");
        }

    }
}
