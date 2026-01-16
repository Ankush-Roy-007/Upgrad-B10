package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.TackUForward;

public class LinearchSearch {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,3};
        int num = 3;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                System.out.println("Element present at index:-"+i);
            }else{
                System.out.println("element is not present");
            }

        }

    }

}
