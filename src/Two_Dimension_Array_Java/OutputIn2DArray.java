package Two_Dimension_Array_Java;

public class OutputIn2DArray {
    public static void main(String[] args) {
//        int[][] arr = new int[3][4];
        int [][] arr = {{4,7,5,8,5},{2,5,6,3,6},{8,9,5,9,9}};
        System.out.println(arr.length);
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
