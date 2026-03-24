package Pattern_Printing;

public class AlphanumericTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 != 0) {   // odd line → numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            } else {            // even line → alphabets
                for (int j = 1; j <= i; j++) {
                    System.out.print((char)(j + 64));
                }
            }
            System.out.println(); // next line
        }
    }
}


