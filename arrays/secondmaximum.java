package arrays;

public class secondmaximum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,76,89,45,6};
        int largest = Integer.MIN_VALUE;
        int seclar = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                seclar = largest;
                largest = arr[i];
            }
            else if(arr[i]>seclar && arr[i]!=largest){
                seclar = arr[i];
            }

        }
        System.out.print(seclar);
    }
}
