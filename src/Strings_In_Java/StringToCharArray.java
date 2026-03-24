package Strings_In_Java;

public class StringToCharArray {
    public static void main(String[] args) {
        String s = "Sudarshan";
        char[] arr = s.toCharArray();    //isTareekeKoHumCamelCaseKehteHai
        for(char ch : arr){
            System.out.println(ch);
        }
    }
}



//package Strings_In_Java;
//
//public class StringToCharArray {
//    public static void main(String[] args) {
//
//        // Ek string declare ki
//        String s = "Sudarshan";
//
//        // String ko character array me convert kiya
//        // toCharArray() → string ke har character ko array me store karta hai
//        char[] arr = s.toCharArray();
//
//        // Note: isTareekeKoHumCamelCaseKehteHai (method naming style)
//
//        // for-each loop use karke har character print kar rahe hain
//        for (char ch : arr) {
//            System.out.println(ch);   // ek-ek character new line me print hoga
//        }
//    }
//}