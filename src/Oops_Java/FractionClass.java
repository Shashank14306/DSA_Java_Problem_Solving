package Oops_Java;
class Fraction{
    int num;
    int den;
    Fraction(int num , int den){
        this.num = num;
        this.den = den;
        simplify();
    }
    void print(){
        System.out.println(num+" / "+den);
    }
    void add(Fraction f){
        num = num * f.den + den *f.num;
        den = den * f.den;
    }
    void multiply(Fraction f) {
        num = num * f.num;
        den = den * f.den;
    }
    void div(Fraction f) {
        num = num * f.den;
        den = den * f.num;
    }
    void simplify(){
        boolean isNegative = (num*den<0)? true : false;
        num = Math.abs(num);
        den = Math.abs(den);
        int gcd = hcf(num,den);
        num = num/gcd;
        den = den/gcd;
        if(isNegative) num = -num;
    }
    int hcf( int a , int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,7);
        f1.print();
        Fraction f2 = new Fraction(2,5);
        f1.add(f2);
        f1.print();
        Fraction f3 = new Fraction(2,2);
        f1.multiply(f3);
        f1.print();
        Fraction f4 = new Fraction(4,3);
        f1.div(f4);
        f1.print();
        Fraction f5 = new Fraction(50,100);
        f5.print();

    }
}
