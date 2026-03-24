package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling Price: ");
        int sp = sc.nextInt();
        sc.close();

        //Method no.1
//        if(sp>cp){
//            System.out.println("Profit is "+(sp-cp));
//        }
//        if(cp>sp){
//            System.out.println("Loss is "+(cp-sp));
//        }
//        if(sp == cp){
//            System.out.println("No profit No loss");
//        }

        //Method no.2
        if(sp>cp){
            System.out.println("Profit is "+(sp-cp));
        }
        else if(cp>sp){
            System.out.println("Loss is "+(cp-sp));
        }
        else {
            System.out.println("No profit No loss");
        }
    }
}
