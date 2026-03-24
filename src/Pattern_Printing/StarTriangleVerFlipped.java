package Pattern_Printing;

import java.util.Scanner;

public class StarTriangleVerFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and column: ");
        int n = sc.nextInt();

        // First Method

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <=n; j++) {
//                if(i+j>n){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        // Second Method

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
