package production.upgradClass;

import java.util.Scanner;

public class naturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<10;i++){
            System.out.println(i+n);
        }
    }
}
