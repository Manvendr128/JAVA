package arrays;

public class swapnumberinarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int n = arr.length;
//        for(int i = 0;i<n/2;i++){
//            //swap n and n-1-i
//            int temp = arr[i];
//            arr[i] = arr[n-i-1];
//            arr[n-i-1] = temp;
//
//        }
        int i =0,j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            i++;
            j--;
        }
        for(i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
