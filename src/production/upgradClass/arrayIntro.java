//package production.upgradClass;
//
//public class arrayIntro {
//    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5};
//        int [] numbers1 = {6,7,8,9,10,11,12,13,14,15};
//        // which array size is greater //loop for smaller size //add smaller to the larger array // print larger size array //Arrays.toString() // if(numbers1.length > numbers.length) { // for( numbers.lenth){ // numbers1 = numbers1 + numbers; // } // System.out.println(Arrays.toString(numbers1)); // } int size; int[] result; if(numbers1.length > numbers.length) { size = numbers.length; result = numbers1; } else { size = numbers1.length; result = numbers; } for(int i = 0; i < size; i++) { result[i] = numbers1[i] + numbers[i]; } System.out.println(Arrays.equals(result, numbers1)); System.out.println(Arrays.toString(numbers1));
//
//    }
