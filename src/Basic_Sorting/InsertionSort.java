package Basic_Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12,1,1,3,56,32,43,2,3,5,6,8,78};
        // Insertion sort algorithm
        for(int i = 1; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int ele : arr)
            System.out.print(ele+" ");
    }
}


 // Time complexity
 // Best case : o(n)
// Average case :o(n sqrt)
// Worst case : o(n sqrt)