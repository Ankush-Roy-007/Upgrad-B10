package JavaPraticeProgram.CommandLineExample.DSA.Array;

public class TwoSum {
    public static void main(String[] args) {
        int k = 6;
        int[] arr ={1 , 2 , 5, 4 , 9};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1 ; j<arr.length;j++){
                sum = arr[i]+arr[j];
                if(sum == k){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
