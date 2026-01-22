package JavaPraticeProgram.CommandLineExample.LectureCodeQuestion.lecture4;

import java.util.Scanner;

public class LoginSystem {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the username");
            String user = sc.nextLine();

            System.out.println("Enter the password");
            String pass = sc.nextLine();

            String userName = "ankush.roy";
            String password = "123456";


            if(user.equals(userName) && pass.equals(password)){
                System.out.println("User Login success");
            }else {
                System.out.println("User Login fail");
            }

        }
}
