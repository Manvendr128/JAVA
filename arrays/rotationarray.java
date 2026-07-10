package arrays;

public class rotationarray{
    public static int[] reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int r = 68;
        r = r%n;
        reverse(arr,0,r-1);
        reverse(arr,r,n-1);
        reverse(arr,0,n-1);
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}