package Oops_Java;
import java.util.*;
class  Cricketer{
//    final String country = "India";
    static String country = "NZ";
    int runs;
    String name;
    double avg;
    void print(){
        System.out.println(runs+" "+name+" "+avg);
    }
    static void greet(){
        System.out.println("I only beleive in jassi bhai");
    }
}
public class FinalAndStaticKeyword {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
//        c1.country = "England";   // this cannot be allowed country can't be change in final keyword
//        System.out.println(c1.country);

        Cricketer c2 = new Cricketer();
//        System.out.println(c2.country);
        c1.country = "India";
        System.out.println(c2.country);
        c2.greet();
        Cricketer.greet();
    }
}
