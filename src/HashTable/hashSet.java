package HashTable;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(4);
        System.out.println(set.clone());
        System.out.println(set.size());
        System.out.println(set.contains(4));
        System.out.println(set.contains(3));
        System.out.println(set.isEmpty());
        set.remove(4);
        System.out.println(set.clone());
        System.out.println(set.hashCode());
        for(int a: set){
            System.out.println(a);
        }

    }
}
