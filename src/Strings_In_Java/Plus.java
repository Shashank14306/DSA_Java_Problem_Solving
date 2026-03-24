//package Strings_In_Java;
//
//public class Plus {
//    public static void main(String[] args) {
//        String s = "shashank";
//        s += " is a good boy";
//        s += 17 ;
//        s += 'a';
//        s += '\n';
//        s += 'n';
//        System.out.println(s);
//        System.out.println("raghav"+10+20);
//        System.out.println(10+20+"shashank");
//        System.out.println(10+"shashank"+20);
//        System.out.println('A'+2+"Isha");
//    }
//}
package Strings_In_Java;

public class Plus {
    public static void main(String[] args) {

        // Initial string
        String s = "shashank";

        // String ke saath concatenate (add) kar rahe hain
        s += " is a good boy";   // shashank is a good boy

        // number add karne par wo string me convert ho jata hai
        s += 17;                // shashank is a good boy17

        // character bhi string me add ho jata hai
        s += 'a';               // shashank is a good boy17a

        // newline character → next line me shift karega
        s += '\n';

        // next line me 'n' print hoga
        s += 'n';

        // final output print
        System.out.println(s);

        // Left to right concatenation hota hai
        System.out.println("raghav" + 10 + 20);
        // "raghav10" + 20 → raghav1020

        System.out.println(10 + 20 + "shashank");
        // 10+20 = 30 → "30shashank"

        System.out.println(10 + "shashank" + 20);
        // "10shashank" + 20 → 10shashank20

        // char ka ASCII value use hota hai
        System.out.println('A' + 2 + "Isha");
        // 'A' = 65 → 65+2 = 67 → "67Isha"
    }
}
