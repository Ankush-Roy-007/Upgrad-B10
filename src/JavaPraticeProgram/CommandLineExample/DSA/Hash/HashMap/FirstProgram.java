package JavaPraticeProgram.CommandLineExample.DSA.Hash.HashMap;

import java.util.HashMap;

public class FirstProgram {
    public static void main(String[] args) {
        HashMap<Integer , Integer>hashMap = new HashMap<>();

        hashMap.put(1,10);
        hashMap.put(2,20);
        hashMap.put(3,30);
        hashMap.put(4,20);
        hashMap.put(5,50);

        System.out.println(hashMap);

        System.out.println(hashMap.get(2));
        System.out.println(hashMap.containsKey(4));
        System.out.println(hashMap.containsValue(20));
        System.out.println(hashMap.size());

        for(var num : hashMap.entrySet() ){
            System.out.println(num.getKey()+"-->"+num.getValue());
        }




    }
}
