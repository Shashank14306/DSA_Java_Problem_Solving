package Two_Dimension_Array_Java;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr= {
                {1, 5, 3},
                {8, 2, 8},
                {4, 7, 6}};
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }


//        for(int i=0; i< arr.length; i++){
//            for(int ele : arr[i]){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }
    }
}
