package Arrays_In_Java;

public class MinimumElementOfArray {
    public static void main(String[] args) {
        // min of array
        int[] arr = {3,7,5,9,4,-6};
//        int min = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
