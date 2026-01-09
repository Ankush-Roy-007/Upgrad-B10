import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give money : ");
        int moneyRec = sc.nextInt();
        System.out.print("enter the biskit qty :");
        int biskitQ = sc.nextInt();
        System.out.print("enter the choclate qty :");
        int choQ = sc.nextInt();
        System.out.print("enter the chips qty :");
        int chipsQ = sc.nextInt();

        int biskit = 10 ;
        int cho = 20;
        int chips = 5;
        int biskitTotal = biskit*biskitQ;
        int choTotal = cho * choQ;
        int chipsTotal = chips * chipsQ;
        int totalBill  = biskitTotal+choTotal+chipsTotal;
        System.out.println("total bill : "+ totalBill);
        System.out.println("money reciverd : "+moneyRec);
        int r = moneyRec-totalBill;
        if(r>=0) {
            System.out.println("return :" + r);
        }else{
            System.out.println("give me extra money:"+r);
        }
    }
}