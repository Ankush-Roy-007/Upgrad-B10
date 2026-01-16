package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

public class RearrangeArrayByPosiAndNegi {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,3,-7,-5};
        int n = arr.length;
        int[] arr1 =new int[n];
        int posIndex = 0;//even
        int negIndex = 1;//odd

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                arr1[posIndex] = arr[i];
                posIndex +=2;
            }else {
                arr1[negIndex] = arr[i];
                negIndex +=2;
            }
        }
        for(int num:arr1){
            System.out.print(" "+num);
        }

    }
}
