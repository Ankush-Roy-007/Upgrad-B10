package production.upgradClass;

import java.util.Scanner;

public class fiveMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt()-1;
        while(true) {
            i++;
            if (i % 5 == 0) {
                continue;
            }
            if (i % 2 == 0) {
               System.out.println(i);
            }
            if(i>50){
                break;
            }

//            System.out.println(i);


        }
    }
}
