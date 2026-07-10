package arrays;
import java.util.*;
public class inputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("input element: ");
        //input loop
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //ouput loop
        for(int i = 0;i<n;i++){
            int m = arr[i];
            if (arr[i]<0) {
                System.out.print(m + " ");
            }

        }
    }
}
