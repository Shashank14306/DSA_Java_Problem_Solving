package Arrays_In_Java;
import java.util.*;
public class LargestElementInArray {
    public static void main(String[] args) {

        class Solution {
            public static int largest(int[] arr) {
                int max = arr[0];

                for(int i = 1; i < arr.length; i++) {
                    if(arr[i] > max) {
                        max = arr[i];
                    }
                }

                return max;
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Input size of array
                System.out.print("Enter number of elements: ");
                int n = sc.nextInt();

                int[] arr = new int[n];

                // Input array elements
                System.out.println("Enter elements:");
                for(int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                // Call function
                int result = largest(arr);

                // Output result
                System.out.println("Largest element: " + result);
            }
        }
    }
}
