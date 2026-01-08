package JavaPraticeProgram.CommandLineExample.Lecture7;
import java.util.*;




public class StringCharaterToArray {
    public static void main(String[] args) {
        String name = "Aditya";
        char[] nameArray = name.toCharArray();

        String convertString = String.valueOf(nameArray);

        String convertString1 = new String(nameArray);

        System.out.println(nameArray.toString());
        System.out.println(convertString);
        System.out.println(convertString1);

    }
}
