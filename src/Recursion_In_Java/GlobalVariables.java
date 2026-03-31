package Recursion_In_Java;

public class GlobalVariables {
    public static void main(String[] args) {
        int x =10;
        fun(x);
        System.out.println(x);
    }
    public static void fun(int x){
        x=20;
    }
}
