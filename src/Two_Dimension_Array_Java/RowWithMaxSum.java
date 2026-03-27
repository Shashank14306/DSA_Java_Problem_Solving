package Two_Dimension_Array_Java;

public class RowWithMaxSum {
    public static void main(String[] args) {
        int [][] arr = {{4,7,5,8,5},{2,5,6,3,6},{8,9,5,9,9}};
        int maxSum = Integer.MIN_VALUE;
        int rowNo = -1;
        for(int i=0; i<arr.length; i++){
            int sum =0;
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                rowNo = i;
            }
        }
        System.out.println(rowNo+" "+maxSum);
    }
}
