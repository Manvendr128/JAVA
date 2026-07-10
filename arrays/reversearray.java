package arrays;
import java.util.*;
public class reversearray {
    public static void main(String[] args) {
        int[] arr = {10,14,23,65,88,90,54};
        for(int i = arr.length - 1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
