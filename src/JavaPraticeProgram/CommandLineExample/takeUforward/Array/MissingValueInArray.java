package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

public class MissingValueInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = 5;
        int missingValue=0;
//        for(int i=1;i<=n;i++){
//            boolean found = false;
//            for(int j=0;j<arr.length;j++){
//                if(arr[j]==i) {
//                    found = true;
//                    break;
//                }
//            }
//            if(!found){
//                System.out.println("Missing element is:-"+i);
//                break;
//            }
//
//        }


        int sum = (n*(n+1))/2;
        int arraySum = 0;

        for (int i=0 ; i<arr.length;i++){
            arraySum += arr[i];
        }

        if(sum != arraySum){
           missingValue = sum - arraySum;
        }

        System.out.println("Missing value is:-"+missingValue);

    }
}
