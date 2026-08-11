package sorting;

import java.util.Scanner;

public class selectionsort {
    public static void selection(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        selection(arr);

        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
