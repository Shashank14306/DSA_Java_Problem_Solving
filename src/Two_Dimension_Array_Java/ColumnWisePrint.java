package Two_Dimension_Array_Java;

public class ColumnWisePrint {
    public static void main(String[] args) {
        int[][] arr= {
                {1, 5, 3},
                {12, 2, 8},
                {4, 7, 6}};
        for(int j=0; j<arr[0].length; j++){
            for(int i=0; i< arr.length; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
