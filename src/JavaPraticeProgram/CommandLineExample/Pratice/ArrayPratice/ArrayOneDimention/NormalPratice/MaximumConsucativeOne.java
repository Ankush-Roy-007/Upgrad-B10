package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

public class MaximumConsucativeOne {
    static void main() {
        int[] arr ={0,1,1,1,0,0,1,0,1,1,1,1};
        int count = 0;
        int maxLength = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxLength=Math.max(maxLength,count);
            }else{
                count=0;
            }
        }
        System.out.println(maxLength);
    }
}
