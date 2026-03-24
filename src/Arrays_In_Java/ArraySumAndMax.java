package Arrays_In_Java;

public class ArraySumAndMax {
    public static void main(String[] args) {
        //sum of array
//        int[] arr = {4,58,25,-14,-3,9,36};
//        int sum = 0;
//        for(int i=0; i<arr.length; i++){
//            sum+=arr[i];
//        }
//        System.out.println(sum);

        //max of array

        int[] arr = {4,58,25,-14,-3,9,36};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element: "+ max);
    }
}
