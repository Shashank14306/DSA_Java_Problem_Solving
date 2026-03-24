package BasicsOf_Java;

import java.util.Scanner;

public class InputsinJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //inputs lene ke liye hai
        System.out.println("Enter the number r: ");
        int r = sc.nextInt();
        int s = r * r;
        System.out.println("Square of r is : ");
        System.out.println(s);
    }
}
