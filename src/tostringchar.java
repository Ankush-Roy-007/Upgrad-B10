import java.util.Scanner;
public class tostringchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Prasanna";
        char[] Arrays = name.toCharArray();
        System.out.println(Arrays.toString());
    }
}

// [C@74a14482 this is output of this code.
// [C@74a14482 this code is known as hashcode which showing a memory address.
// not have string content to show a actual string.