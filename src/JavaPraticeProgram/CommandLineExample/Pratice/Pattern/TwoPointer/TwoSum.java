package JavaPraticeProgram.CommandLineExample.Pratice.Pattern.TwoPointer;

public class TwoSum {
    public static void main(String[] args) {

        int[] number = {1 , 2 ,3 ,4 ,5};
        int target = 6;
        int sum = 0;
        int i = 0;
        int j = number.length - 1;
        boolean found = false;
        while(i<j){
            sum=number[i]+number[j];
            if(sum == target){
                System.out.println(i+" "+j);
//                found = true;
//                break;
                i++;
                j--;

            } else if  (sum > target){

                j--;
            }
           else {
                i++;
            }
        }

    }
}
