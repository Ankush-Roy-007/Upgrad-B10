import java.util.Scanner;
public class largestnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 30;
        int c = 20;

        if(a > b && c > a) {
            System.out.println("a number is largest" + a);
        }
        else if(b > c) {
            System.out.println("b number is largest" + b);
        }
        else{
            System.out.println("c number is largest" + c);
        }
    }
}
