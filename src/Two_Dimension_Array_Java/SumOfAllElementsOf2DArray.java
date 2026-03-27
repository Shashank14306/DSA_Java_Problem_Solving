package Two_Dimension_Array_Java;

public class SumOfAllElementsOf2DArray {
    public static void main(String[] args) {
        int [][] arr = {{4,7,5,8,5},{2,5,6,3,6},{8,9,5,9,9}};
        int sum =0;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
        }
}
