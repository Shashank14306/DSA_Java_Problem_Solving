package Strings_In_Java;

import java.util.Scanner;

public class SumOfAllSubStrings {
    public static void main(String[] args) {

        // Scanner object input lene ke liye
        Scanner sc = new Scanner(System.in);

        // string input lo (number form me)
        // Example: 123
        String s = sc.nextLine();

        int sum = 0;

        // string ki length
        int n = s.length();

        // outer loop → starting index
        for (int i = 0; i < n; i++) {

            // inner loop → ending index
            for (int j = i; j < n; j++) {

                // substring nikaal rahe hain (i se j tak)
                String sub = s.substring(i, j + 1);

                // substring ko integer me convert karke sum me add
                sum += Integer.parseInt(sub);
            }
        }

        //  print
        System.out.println("Sum of all substrings: " + sum);
    }
}