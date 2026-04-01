package Recursion_In_Java;

import java.util.ArrayList;

public class StringsBasicsMore {
    public static void main(String[] args) {
        String s = "Shashank";
        change(s);
        System.out.println(s);

        String [] arr = {"shashank","shaurya","rupesh","shoaib"};

        ArrayList<String> al = new ArrayList<>();
        al.add("Sima");
        al.add("Satyam");
        al.add("Shikha");
        System.out.println(al);

        chnage2(al);
        System.out.println(al);
    }
// Pass By Value

    private static void chnage2(ArrayList<String> al){
        al.add("shiva");
    }
    private static void change(String s){
        s="Sudarshan";
    }
}
