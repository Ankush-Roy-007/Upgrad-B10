import java.util.Scanner;
public class shipping {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount:");
        int a = sc.nextInt();

        if(a>=100){
            System.out.println("The Shipping Is free");
        }
        else if (a>=50 && a<100){
            System.out.println("The shipping cost is 5 ");
        }
        else{
            System.out.println("the shipping cost is 10");
        }
        System.out.println("$"+a);
    }
}

