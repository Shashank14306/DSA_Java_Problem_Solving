package BasicsOf_Java;

public class AsciiValues {
    public static void main(String[] args) {
//         Type casting -- ek data type se dusre data type me conversion
        char ch = 'A';
        int x = ch; //implicit typecasting
        System.out.println(x);

        char ab = 'a';
        int y = (int)ab; //explicit typecasting
        System.out.println(y);

        char harsh = '3';
        System.out.println((int)harsh);

        char chr = 'b';
        System.out.println(chr+0);

        //integer to character
        int z = 39;
        char sh = (char)z;
        System.out.println(sh);
    }
}
