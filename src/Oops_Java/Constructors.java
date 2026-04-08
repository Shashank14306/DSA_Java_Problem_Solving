package Oops_Java;

public class Constructors {
    public static class Car{
        int seats;
        String name;
        double length;
        Car(){

        }
        Car(int x , String s , double d){  // default constructor
            seats = x;
            name = s;
            length = d;
        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(5,"Kia Sonet",3.99);
        c1.print();
        Car c2 = new Car(7,"Enova",8.99);
        c2.print();
        Car c3 = new Car();
        c3.name = "Honda Amaze";
    }
}
