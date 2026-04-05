package Cyclic_Sort_Java;

import java.util.Scanner;

public class MissingInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.missingNum(arr);
        System.out.println("Missing number: " + result);
    }
}
class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == i + 1 || arr[i] == n){
                i++;
            }
            else {
                int idx = arr[i] - 1;
                if(arr[i] != arr[idx]){
                    swap(arr, i, idx);
                } else {
                    i++;
                }
            }
        }
        for(i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                return i + 1;
            }
        }
        return n;
    }
    private void swap(int[] arr, int i, int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}