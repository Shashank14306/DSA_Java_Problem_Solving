package Loops;

public class GPhw {
    public static void main(String[] args) {
        int n = 7;  // you can take input using Scanner if you want
        int i = 1, j = n;

        while (i <= j) {
            System.out.print(i + " ");  // print from start
            if (i != j) {               // avoid double printing in the middle
                System.out.print(j + " ");  // print from end
            }
            i++;
            j--;
        }
    }
}
