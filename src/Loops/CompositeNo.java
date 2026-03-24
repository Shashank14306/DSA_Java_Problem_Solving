package Loops;

import java.util.Scanner;

public class CompositeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        for (int i = 2; i <= n-1 ; i++) {
            if(n%i==0){
                System.out.println("Composite number");
                break;
            }
        }

    }
}
