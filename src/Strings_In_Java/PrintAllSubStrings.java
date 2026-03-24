package Strings_In_Java;

public class PrintAllSubStrings {
    public static void main(String[] args) {
        String s = "shashank";
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                System.out.print(s.substring(i,j)+" ");  // i to j
            }
            System.out.println();
        }
    }
}
