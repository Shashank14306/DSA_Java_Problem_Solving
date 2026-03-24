package Arrays_In_Java;
import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int x = 4; //4 bytes leta hai ye
        int[] arr = {10,20,30,40}; //16 byte
//        int[] x = arr;   // x is shallow copy of arr
//        x[0] = 100;
        int[] y = Arrays.copyOf(arr,arr.length);
        y[0] = 100;
        System.out.println(y[0]);

    }
}
