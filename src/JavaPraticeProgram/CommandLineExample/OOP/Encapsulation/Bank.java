package JavaPraticeProgram.CommandLineExample.OOP.Encapsulation;

import java.util.Scanner;

public class Bank {
    private int balance;
    private String name;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        bank.setName(sc.nextLine());
        bank.setBalance(sc.nextInt());

        System.out.println("User Name is:-"+bank.getName()+"\nAccount Balance is:- "+bank.getBalance());
    }
}
