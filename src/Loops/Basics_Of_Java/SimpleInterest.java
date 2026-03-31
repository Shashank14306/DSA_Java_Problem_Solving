package BasicsOf_Java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of principle: ");
        double P = sc.nextDouble();
        System.out.print("Enter the value of rate: ");
        double R = sc.nextDouble();
        System.out.print("Enter the value of time: ");
        double T = sc.nextDouble();

        System.out.print("The simple interest is :");
        double SI = ( P * R * T ) / 100;
        System.out.println(SI);
    }
}
