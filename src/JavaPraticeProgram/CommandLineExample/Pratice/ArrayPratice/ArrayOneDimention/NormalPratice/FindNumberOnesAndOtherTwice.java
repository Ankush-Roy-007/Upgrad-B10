package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

public class FindNumberOnesAndOtherTwice {
    static void main() {
        int[] arr = {1,1,2,3,3,4,4};
        for(int i=0;i<arr.length-1;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
                break;
            }
        }

        // Second Way

        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        System.out.println(xor);
    }
}
