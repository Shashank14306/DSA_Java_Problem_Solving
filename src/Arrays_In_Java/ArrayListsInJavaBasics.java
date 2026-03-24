package Arrays_In_Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListsInJavaBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(17);

        System.out.println(arr.get(2));  //arr[2]
        arr.set(3,51);  // arr[3] = 51

        System.out.println(arr);  //not traversing the array by our self
        int n = arr.size();    //arr.length
//        for(int i=0; i<n; i++){
//            System.out.print(arr.get(i)+" ");
//        }
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
        System.out.println();
        // 25,21,18,51
        arr.add(78);
        arr.add(1,100);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);

        int i=0, j = arr.size()-1;
        while (i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }

//        Collections.reverse(arr);
        System.out.println(arr);
    }
}
