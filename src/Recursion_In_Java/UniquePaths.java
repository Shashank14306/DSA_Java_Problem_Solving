package Recursion_In_Java;

import java.util.Scanner;

public class UniquePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Number of unique paths: "+path(m,n));
    }
    public static int path(int m , int n){
        if(m==1 || n==1) return 1;
        return path(m-1,n) + path(m,n-1);
    }
}
