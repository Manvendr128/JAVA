package arrays;
import java.util.*;
public class builtinarraymethods {
    public static void main(String[] args) {
//        int[] arr = {2,54,76,87,3,56,89};
//        Arrays.sort(arr);
//        for(int i = 0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
        int[] b = new int[5];
        Arrays.fill(b,18); // time complexity = O(n)
        for(int i = 0;i<b.length;i++){
            System.out.print(b[i] + " ");
        }

    }
}
