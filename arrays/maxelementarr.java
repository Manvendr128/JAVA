package arrays;
import java.util.*;
public class maxelementarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = arr[0];
//        int max = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println(max);


    }

}
