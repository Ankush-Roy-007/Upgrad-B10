package HashTable;
import java.util.Hashtable;

public class Sum {
    public static void main(String[] args) {
        Hashtable<Integer , Integer> ht = new Hashtable();

        int[] arr = {10,30,40,20,50};
        int k = 30;

        for(int num : arr){
            int sum = k-num;
            if(ht.containsKey(sum)){
                System.out.println(sum+" "+num);
            }
            ht.put(num,1);
        }

    }
}
