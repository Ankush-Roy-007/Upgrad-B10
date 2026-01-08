import java.util.Scanner;
import java.util.Arrays;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = {1, 2, 3, 4, 5};
        int[] number1 = {1, 2, 3, 4, 5};
        System.out.println(number == number1);
        System.out.println(Arrays.equals(number1,number));
    }
}

//we have to add arrays as a package and class name in this code.
//after adding a arrays package then we have to change System.out.println(Arrays.equals(number1,number));
// after this change code will execute and give the return true in output.