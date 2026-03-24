package Arrays_In_Java;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {8,5,4,75,63,45,14,24};
        int n = arr.length;
        int i = 0 , j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
        for(i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
