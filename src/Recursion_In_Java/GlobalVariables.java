package Recursion_In_Java;

public class GlobalVariables {
    static int x =17;
    public static void main(String[] args) {
//        int x =10;
        fun();
        System.out.println(x);
    }
    public static void fun(){
        x=20;
    }
}
