package If_Else;

import java.util.Scanner;

public class IsIntegerorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x==0){
            System.out.println("Is an integer number");
        }
        else {
            System.out.println("Not an integer number");
        }
    }
}
