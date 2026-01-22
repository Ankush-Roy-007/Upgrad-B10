package JavaPraticeProgram.CommandLineExample.DSA.Hash.HashSet;

import java.util.HashSet;

public class FirstProgram {
    public static void main(String[] args) {
        HashSet<Integer>hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);

        System.out.println(hs);
        System.out.println("Element present or not:-"+hs.contains(30));
        System.out.println("Remove element:-"+hs.remove(10));
        System.out.println(hs.size());
        System.out.println(hs);

    }
}
