package If_Else;

import java.util.Scanner;

public class TernaryBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

//        if(n%2 == 0)
//            System.out.println("Even");
//        else
//            System.out.println("Odd");

        //Ternary Operator
        System.out.println((n%2==0) ? "Even" : " Odd");
    }
}
