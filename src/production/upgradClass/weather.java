package production.upgradClass;

import java.util.Scanner;

public class weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter weather : ");
        String wheather = sc.nextLine();
        switch (wheather){
            case "summer" : System.out.println("its hot out there you will dehydrate");
            break;
            case "rainy" : System.out.println("its rain out there please take umbrella");
            break;
            case "winter" : System.out.println("its cold out grab some warm clothes");
            break;
            default: System.out.println("there is no weather like this");
            break;
        }
    }
}
