package arrays;
import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int [] arr = new int[m];
        int n = arr.length;
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n-1;i++){ // n-1 passes chlenge
            for(int j = 0;j<n-i-1;j++){ // swapping hogi isme
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr [j] = arr[j+1];
                    arr [j+1] = temp;
                }
            }

        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
