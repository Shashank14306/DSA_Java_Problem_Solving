//package Cyclic_Sort_Java;
//
//import java.util.Scanner;
//
//public class DuplicateNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Input size
//        int n = sc.nextInt();
//
//        int[] nums = new int[n];
//
//        // Input array elements
//        for(int i = 0; i < n; i++){
//            nums[i] = sc.nextInt();
//        }
//
//        Solution obj = new Solution();
//        int result = obj.findDuplicate(nums);
//
//        System.out.println("Duplicate number: " + result);
//    }
//}
//
//class Solution {
//    public int findDuplicate(int[] nums) {
//        int i = 0;
//
//        while(i < nums.length){
//            if(nums[i] != i + 1){
//                int correct = nums[i] - 1;
//
//                // Duplicate condition
//                if(nums[i] == nums[correct]){
//                    return nums[i];
//                }
//
//                // Swap
//                int temp = nums[i];
//                nums[i] = nums[correct];
//                nums[correct] = temp;
//            } else {
//                i++;
//            }
//        }
//
//        return -1;
//    }
//}