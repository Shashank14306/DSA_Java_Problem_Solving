package If_Else;

import java.util.Scanner;

public class TernaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

//        int shashank;
//        if(n>=0) shashank = 100;
//        else shashank = 0;

        int shashank = (n>=0) ? 100 : 0;

        System.out.println(shashank);
    }
}
