package JavaPraticeProgram.CommandLineExample.DSA.ArrayList;

import java.util.ArrayList;

public class ArrayListImp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);       // [10, 20, 30]
        System.out.println(list.get(1)); // 20

        list.set(1, 25);
        list.remove(0);

        System.out.println(list);       // [25, 30]
        System.out.println(list.size()); // 2
    }
}
