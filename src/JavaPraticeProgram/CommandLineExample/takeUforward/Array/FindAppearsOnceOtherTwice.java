package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

public class FindAppearsOnceOtherTwice {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
//        for(int i = 0;i<arr.length;i++){
//            int count=0;
//            for(int j=0;j<arr.length-1;j++){
//                if(arr[j]==arr[i]){
//                    count++;
//                }
//            }
//            if(count==1){
//                System.out.println(arr[i]);
//                break;
//            }
//        }


        int xor = 0;
        for(int i=0 ; i<arr.length;i++){
            xor = xor ^ arr[i];

        }
        System.out.println(xor);

    }
}
