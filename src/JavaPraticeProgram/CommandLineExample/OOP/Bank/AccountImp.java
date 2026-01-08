package JavaPraticeProgram.CommandLineExample.OOP.Bank;

import java.util.Scanner;

public class AccountImp {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the user name");
        String name = sc.nextLine();
        System.out.println("Enter the account number");
        int accountNumber =  sc.nextInt();
        System.out.println("Enter the balance");
        double balance = sc.nextDouble();

        account.CreteAccount(name,accountNumber,balance);
        System.out.println("Account is created");

        int ch;

        do{
            System.out.println("1:-Withdraw Money");
            System.out.println("2:-Deposit Money");
            System.out.println("3:-Display Account Details");
            System.out.println("4:-Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();

            switch (ch){
                case 1:
                    account.withDrawMoney();
                    break;
                case 2:
                    account.depositMoney();
                    break;
                case 3:
                    account.display();
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Enter wrong choise");

            }

        }while (ch < 4);



    }
}
