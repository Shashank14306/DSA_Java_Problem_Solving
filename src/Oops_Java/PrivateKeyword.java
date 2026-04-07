package Oops_Java;
 class Students{
    String name ; // null
    private int roll ; // 0
    double cgpa ;// 0.0
       void print(){ // getter
         System.out.println(name+" "+roll+" "+cgpa);
     }                                                              //encapsulation
    int getRoll(){
           return roll;
    }
    void setRoll(int x){
           roll = x;
    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        //s1.print();
        s1.cgpa = 8.9;
        s1.name = "shashank";
        //s1.roll = 17;  error
        s1.setRoll(17);
        System.out.println(s1.getRoll());
//        s1.print();
//        Students s2 = new Students();
//        s2.print();
    }
}



// Add more comments for better understanding //


//package Oops_Java;

// Class representing a student
//class Students {

//    String name;        // default value = null
//    private int roll;   // private → cannot access directly outside this class (Encapsulation)
//    double cgpa;        // default value = 0.0

    // Method to print student details
//    void print() {
//        System.out.println(name + " " + roll + " " + cgpa);
//    }

    // Getter method → used to READ private variable 'roll'
//    int getRoll() {
//        return roll;
//    }

    // Setter method → used to UPDATE private variable 'roll'
//    void setRoll(int x) {
//        roll = x;
//    }
//}

// Main class
//public class PrivateKeyword {
//    public static void main(String[] args) {

        // Creating object of Students class
//        Students s1 = new Students();

        // Assigning values to public/default variables
//        s1.cgpa = 8.9;
//        s1.name = "shashank";

        // s1.roll = 17; ❌ ERROR because 'roll' is private

        // Correct way to set private variable using setter
//        s1.setRoll(17);

        // Correct way to access private variable using getter
//        System.out.println(s1.getRoll());

        // Print all details (optional)
        // s1.print();

        // Creating another object
        // Students s2 = new Students();
        // s2.print();  // will print default values (null 0 0.0)
//    }
//}