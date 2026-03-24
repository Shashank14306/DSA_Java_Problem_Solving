package Strings_In_Java;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        String s = "" + n;
        System.out.println(s.length());
//        double d = 3.14;
//        String s = "shashank";
//        s += d;
//        System.out.println(s);
    }
}

//package Strings_In_Java;
//
//import java.util.Scanner;
//
//public class CountDigits {
//    public static void main(String[] args) {
//
//        // Scanner object banaya input lene ke liye
//        Scanner sc = new Scanner(System.in);
//
//        // user se integer input le rahe hain
//        int n = sc.nextInt();
//
//        // integer ko string me convert kar rahe hain
//        // "" + n → number ko string bana deta hai
//        String s = "" + n;
//
//        // string ki length print kar rahe hain
//        // length() → total number of characters (digits)
//        System.out.println(s.length());
//    }
//}