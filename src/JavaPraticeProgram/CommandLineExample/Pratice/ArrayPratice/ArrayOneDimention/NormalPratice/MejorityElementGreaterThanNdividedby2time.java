package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

public class MejorityElementGreaterThanNdividedby2time {
    static void main() {
        int[] arr = {2,2,3,3,1,2,2};
//        for(int i=0;i<arr.length;i++){
//            int count = 0;
//            for(int j=0;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if(count>arr.length/2){
//                System.out.println(arr[i]);
//                break;
//            }else{
//                System.out.println("Element not present");
//            }
//        }

        //Second Way
        int count = 0;
        int candidate = 0;

        for(int num:arr){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }else{
                count--;
            }
        }
        count = 0;
        for (int num:arr){
            if(num==candidate){
                count++;
            }
        }
        if(count>arr.length/2){
            System.out.println(candidate);
        }else{
            System.out.println("Not present");
        }
    }
}
