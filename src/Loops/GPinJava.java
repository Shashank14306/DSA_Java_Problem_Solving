package Loops;

import java.util.Scanner;

public class GPinJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        // GP:- 1,2,4,8......
        int a=1 , r=2;
        for (int i = 1; i <=n ; i++) {
            System.out.print(a+" ");
            a*=r;
        }
    }
}
