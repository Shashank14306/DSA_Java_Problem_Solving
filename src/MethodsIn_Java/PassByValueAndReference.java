package MethodsIn_Java;

public class PassByValueAndReference {
    public static void change(int x){
        x = 10;
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change(x);   // Pass by value.
        System.out.println(x);
    }
}

