package Two_Dimension_Array_Java;

public class MaxElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {
                {1, 5, 3},
                {12, 2, 8},
                {4, 7, 6}};
        int n = arr.length;
        int m = arr[0].length;
        int max = arr[0][0];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
