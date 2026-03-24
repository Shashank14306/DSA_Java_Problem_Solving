package Strings_In_Java;

public class BuiltInMethods {
    public static void main(String[] args) {

        // Two string variables declare kiye
        String a  = "Harshita";
        String b = "Priya";

        // indexOf() → first occurrence ka index deta hai
        // System.out.println(a.indexOf('a'));   // output: 1

        // lastIndexOf() → last occurrence ka index deta hai
        // System.out.println(a.lastIndexOf('a'));  // output: 7

        // toUpperCase() → string ko uppercase me convert karta hai
        // System.out.println(a.toUpperCase());  // HARSHITA

        // contains() → check karta hai substring present hai ya nahi
        // System.out.println(a.contains("Harsh"));  // true

        // if condition ke saath use
        // if(a.contains("arsh"))
        //     System.out.println("good");

        // startsWith() → check karta hai string kis se start ho rahi hai
        // System.out.println(a.startsWith("Ha"));  // true

        // endsWith() → check karta hai string kis pe end ho rahi hai
        // System.out.println(a.endsWith("ta"));  // true

        // concat() → do strings ko join karta hai
//        System.out.println(a.concat(b));  // HarshitaPriya


//        String str = "3446546";
//        int n = Integer.parseInt(str);
//        System.out.println(n+1);
    }
}