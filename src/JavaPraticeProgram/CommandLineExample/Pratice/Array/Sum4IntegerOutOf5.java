package JavaPraticeProgram.CommandLineExample.Pratice.Array;

public class Sum4IntegerOutOf5 {


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    sum+=arr[j];
                }
            }
            if(sum > max){
                max = sum;
            }
            if(sum < min){
                min = sum;
            }
        }
        System.out.println(min);
        System.out.println(max);

    }

}
