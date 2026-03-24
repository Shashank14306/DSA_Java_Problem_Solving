package Strings_In_Java;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.length()+" "+s.capacity());
        s.append("Shashank");
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.setCharAt(1,'o');
        System.out.println(s);
        String t = s.toString();
        System.out.println(t);
        s.append("askbnckadbckbskvbdskbdck");
        System.out.println(s.length()+" "+s.capacity());
    }
}
