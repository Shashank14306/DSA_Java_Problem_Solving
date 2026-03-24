package Arrays_In_Java;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        int[] arr = {5, -8, 2, 67, 43, 97};
        Scanner sc = new Scanner(System.in);
//        System.out.println(arr.length);
//        for (int i = 0; i<=5; i++){
//            System.out.print(arr[i]+" ");

//        int n = arr.length;   // index:- 0 to n-1
//        for (int i = 0; i<n; i++ ){
//            System.out.println(arr[i]+" ");
//    }

        int[] karan = new int[7];
        //input
        for(int i=0; i<7; i++){
            karan[i] = sc.nextInt();
        }
        //print
        for (int i = 0; i<7; i++){
            System.out.print(2*karan[i]+" ");
        }
    }

}
