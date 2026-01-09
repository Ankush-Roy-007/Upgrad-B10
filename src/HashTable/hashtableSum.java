package HashTable;

import java.util.Hashtable;

public class hashtableSum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8,6 };
        int sum = 14;
        hashtableSum.printPairs(arr, sum);
//        System.out.println("hi");
        ;
    }

    public static void printPairs(int[] arr, int sum) {
        Hashtable<Integer,Integer> table = new Hashtable<>();
        for(int i=0;i<arr.length;i++){
            int diff =sum-arr[i];
            if(table.values().contains(diff)){
                System.out.println("pair is "+diff+" + "+arr[i]+" = "+(diff+arr[i]));
            }
            table.put(diff,arr[i]);
        }
       // System.out.println(table.entrySet());
    }

}
