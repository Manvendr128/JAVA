package sorting;
import java.util.*;
public class bubblesort {
    public static void bullblesort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            boolean swap = false;
            for(int j = 0 ;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        bullblesort(arr);

        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
