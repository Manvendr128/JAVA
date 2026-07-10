package arrays;
import java.util.*;
public class ques {
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
            if (arr[i%2]==1) {
                m = m*2;
            }
            else if(arr[1%2]==0){
                m = m +10;
            }


        }

    }
}
