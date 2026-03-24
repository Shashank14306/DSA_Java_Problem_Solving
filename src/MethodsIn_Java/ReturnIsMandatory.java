package MethodsIn_Java;

public class ReturnIsMandatory {
    public static void main(String[] args) {
        System.out.println(num(8));
    }
    public static int num(int a){
        if(a>5){
            return a;
        }
        else return -7;
    }
}
