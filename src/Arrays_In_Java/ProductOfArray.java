package Arrays_In_Java;

public class ProductOfArray {
    public static void main(String[] args) {
        //Product of Array
        int[] arr = {3,7,5,6,-6,9};
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product*=arr[i];
        }
        System.out.println(product);
    }
}
