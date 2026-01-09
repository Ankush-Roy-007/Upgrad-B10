package HashTable;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"viki");
        map.put(2,"adi");
        for(Map.Entry<Integer, String> a : map.entrySet()){
            System.out.println("emp name");
        }
    }
}
