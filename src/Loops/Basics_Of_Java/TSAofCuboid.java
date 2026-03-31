package BasicsOf_Java;

public class TSAofCuboid {
    public static void main(String[] args) {
        double l = 4;
        double b = 8;
        double h = 12;
        double TSA = 2 * (l * b + b * h + h * l);
        System.out.println(TSA);
    }
}