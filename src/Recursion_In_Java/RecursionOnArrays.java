package Recursion_In_Java;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {5,3,2,8,7,4,16};
//        recPrint(arr,0);
        int target = 7;
        System.out.println(exists(arr,target,0));
    }
//    public static void recPrint(int[] arr , int idx){
//        if(idx == arr.length) return;
//        System.out.print(arr[idx]+" ");
//        recPrint(arr,idx+1);
//        System.out.print(arr[idx]+" ");
//    }

    public static boolean exists(int[] arr , int target , int idx){
        if(idx == arr.length) return false;
        if(arr[idx] == target) return true;
        return exists(arr, target , idx+1);
    }
}
