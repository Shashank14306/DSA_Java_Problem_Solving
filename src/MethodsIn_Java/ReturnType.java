package MethodsIn_Java;

public class ReturnType {
    public static int prasun(int a){
        System.out.println("Banu");
//        System.out.println("Nanda");
        if(a>0) return 5; // khatam
        else return 10;
    }
    public static void main(String[] args) {
//        System.out.println(3+prasun());
        int x = prasun(7);
        System.out.println(3+x);
    }
}
