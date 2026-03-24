package Arrays_In_Java;

public class RotateArray {

    // rotate method (right rotate by k)
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // handle large k

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    // reverse method
    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        rotate(arr, 3);  // rotate by 3 steps

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

