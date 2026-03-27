package Two_Dimension_Array_Java;

public class SnakePatternIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {{1, 5, 3}, {8, 2, 8}, {4, 7, 6}};
        for(int i=0; i< arr.length; i++){
            if(i%2==0){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
