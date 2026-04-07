package Oops_Java;

import java.util.Scanner;

public class UserDefinedDataType {
    public static class Students{ // khud kaa ek data type bana liya hai
        //class
        String name ;
        int roll ;
        double cgpa;
        void print(){
            System.out.println(name+" "+roll+" "+cgpa);
        }
    }
    public static void main(String[] args) {
        //objects
        Scanner sc = new Scanner(System.in);

        Students s1 = new Students();  // declaration
        s1.name = "Shashank";
        s1.roll = 17;
        s1.cgpa = 7.9;

        Students s2 = new Students();  // declaration
        s2.name = "Sudarshan";
        s2.roll = sc.nextInt();
        s2.cgpa = 9.9;

        Students s3 = new Students();  // declaration
        s3.name = "Shaurya";
        s3.roll = 18;
        s3.cgpa = 9.8;

        System.out.println(s1.name+" "+s1.roll+" "+s1.cgpa);
        s2.cgpa = 10;
//        System.out.println(s2.cgpa);
        System.out.println(s2.roll);

        s1.print();
        s2.print();
        s3.print();
    }
}
