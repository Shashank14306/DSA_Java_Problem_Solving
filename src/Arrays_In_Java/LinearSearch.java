package Arrays_In_Java;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,3,27,53,18,62,88,6};
        int target = 12;
        boolean flag = false;  // false means target array me nhi hai
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                flag = true; // true means target array me hai
                break;
            }
        }
        if(flag == true){
            System.out.println("Target exists in Array");
        }
        else {
            System.out.println("Target does not exists in array");
        }
    }
}
