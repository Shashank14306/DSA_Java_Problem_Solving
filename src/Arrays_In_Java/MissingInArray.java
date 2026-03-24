package Arrays_In_Java;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1;

        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        int missing = totalSum - arrSum;
        System.out.println("Missing number = " + missing);
    }
}
