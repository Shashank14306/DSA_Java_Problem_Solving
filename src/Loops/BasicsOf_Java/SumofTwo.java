package BasicsOf_Java;

import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        System.out.print("Enter the third number: ");
        int z = sc.nextInt();

        System.out.print("The sum of three numbers = ");
        System.out.println(x+y+z);
    }
}
