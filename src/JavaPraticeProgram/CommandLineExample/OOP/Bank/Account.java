package JavaPraticeProgram.CommandLineExample.OOP.Bank;

import java.util.Scanner;

public class Account {
    private String name;
    private int accountNumber;
    private double balance;
    Scanner sc = new Scanner(System.in);
    public void CreteAccount(String name,int accountNumber , double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display(){
        System.out.println("Account User Name:- "+name);
        System.out.println("Account Number:- "+accountNumber);
        System.out.println("Account Balance:-"+balance);
    }

    public void withDrawMoney(){

        System.out.println("Enter the amount to withdraw");
        int Money = sc.nextInt();
        if(Money <= balance){
            balance =balance - Money;
            System.out.println("Remaining balance is:- "+balance);
        }else {
            System.out.println("Insufficient balance");
        }
    }

        public void depositMoney() {

            System.out.println("Enter the amount to deposit");
            int Money = sc.nextInt();

                balance = balance + Money;
                System.out.println("Total balance is "+balance);



        }

}
