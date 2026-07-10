package arrays;

public class rotatearray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int n = arr.length;
        int i =3,j=7;
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
