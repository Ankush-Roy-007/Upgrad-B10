package JavaPraticeProgram.CommandLineExample.DSA.Hash.HashTable;

import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class FiestProgram {
    public static void main(String[] args) {
        Hashtable<Integer , Integer> hashtable = new Hashtable<>();

        System.out.println("Insert element in hash table");
        hashtable.put(1,10);
        hashtable.put(2,20);
        hashtable.put(3,30);
        hashtable.put(4,40);
        hashtable.put(5,50);

        System.out.println("Element in hashtable:-"+hashtable);

        System.out.println("Value at key 3:-"+hashtable.get(3));

        System.out.println("After remove element at index 4:-"+hashtable.remove(4));
        System.out.println("Element in hashtable:-"+hashtable);
        System.out.println("Contains key 2?:-"+hashtable.containsKey(2));
        System.out.println("Contains value 10?"+hashtable.containsValue(10));
        System.out.println("Size: " + hashtable.size());
        Set<Integer> keys = hashtable.keySet();
        System.out.println("Keys: " + keys);

        Collection<Integer> values = hashtable.values();
        System.out.println("Values: " + values);
//                                            Type casting is done in this process because hashtable.clone()
//                                            In the form of object we need to convert it into hashtable
        Hashtable<Integer , Integer> set2 = (Hashtable<Integer, Integer>) hashtable.clone();
        System.out.println("Clone hashtable"+set2);

    }
}
