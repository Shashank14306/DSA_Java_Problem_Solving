package Recursion_In_Java;

import java.sql.SQLOutput;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(5,'A','B','C');
    }
    public static void hanoi(int n, char A , char B , char C){
        if(n==0) return;  // base case
        hanoi(n-1,A,C,B);    // n-1 disks from A to B via C
        System.out.println(A+"->"+C);    // Larget from A to C
        hanoi(n-1,B,A,C);    // n-1 disks from B to C via A
    }
}
