package Strings_In_Java;

public class SubStringsOfString {
    public static void main(String[] args) {
      String s = "Shashank";
        System.out.println(s.substring(1,5)); // 1 to 4 will be printed
        System.out.println(s.substring(1,s.length()-1));
    }
}
