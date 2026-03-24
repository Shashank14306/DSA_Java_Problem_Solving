package Loops;

public class TableOf17 {
    public static void main(String[] args) {
        // 154 iteration hai loop ke and print only 10 times

        // 1st Method

//        for (int i = 1; i <=170 ; i++) {
//            if(i%17==0){
//                System.out.println(i);

        //2nd Method(Best method as compared to first)

//        for (int i = 17; i <=170 ; i=i+17) {
//            {
//                System.out.println(i);
//            }

        //3rd Method (Bestest method)

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 17);
        }
    }
}


