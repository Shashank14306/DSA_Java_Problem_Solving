package Strings_In_Java;

public class PassingStringToMethod {
        public static void change(String x){
            x = "Shashank";
        }
    public static void main(String[] args) {
            String x = "Sudarshan";
            System.out.println(x);
            change(x);
            System.out.println(x);
    }
}
