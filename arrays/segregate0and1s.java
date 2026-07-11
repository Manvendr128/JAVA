package arrays;

public class segregate0and1s {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,1,0,1,0,1,0,1};
        int j = arr.length-1;
        int i = 0;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int m = 0;m<arr.length;m++) {
            System.out.print(arr[m] + " ");
        }
    }
}
