package Recursion_In_Java;

import java.util.Scanner;

public class FunctionCallingItself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println("Enter the value of n : ");
        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
}
