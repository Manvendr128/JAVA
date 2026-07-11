package arrays;

public class wavearray {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,1,0,1,0,1,0,1};
        int i = 0;
        int j = i + 1;
        while(i<arr.length-1 || j<arr.length-1){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i = i +2;
            j = j +2;

        }
        for(int m = 0;m<arr.length;m++){
            System.out.print(arr[m] + " ");
        }
    }
}
