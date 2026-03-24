package If_Else;

import java.util.Scanner;

public class GreatestOfThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        // 1Method

//        if(a>b && a>c){
//            System.out.println(a);
//        }
//        else {
//            if(b>a && b>c)
//                System.out.println(b);
//            else
//                System.out.println(c);

        //2nd method
        if (a >= b) {
            if (a >= c)
                System.out.println(a);
            else
                System.out.println(c);
        } else {
            if (b >= c)
                System.out.println(b);
            else
                System.out.println(c);
        }

    }

}

