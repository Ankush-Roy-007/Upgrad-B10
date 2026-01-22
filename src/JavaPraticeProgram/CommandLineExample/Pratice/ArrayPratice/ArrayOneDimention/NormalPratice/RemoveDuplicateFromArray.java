package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

public class RemoveDuplicateFromArray {
    public static void main() {
        int[] arr = {1,1,2,2,3,3,4};
        int i =0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
