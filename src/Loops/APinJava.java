package Loops;

import java.util.Scanner;

public class APinJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        // AP:- 2,5,8,11,14.....

//        for (int i=2; i<=3*n-1 ; i+=3) {
//            System.out.println(i+" ");

        //2nd Method
        int a = 2 , d = 3;
        for (int i =1; i<=n; i++) {
            System.out.print(a+" ");
            a+=d;
        }
    }
}

