package If_Else;

import java.util.Scanner;

public class StudentsCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("shashank");
        }
        else if (n%3==0) {
            System.out.println("Sudarshan");
        }
        else if (n%5==0) {
            System.out.println("Himanshu");
        }
        else {
            System.out.println("Priyanshu");
        }
    }
}
