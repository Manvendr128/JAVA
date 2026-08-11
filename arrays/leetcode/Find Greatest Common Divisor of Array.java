class Solution {
    public int findGCD(int[] arr) {
        int small = arr[0];
        int large = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
         for(int i = 0;i<arr.length;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        while(small != 0){
        int temp = small;
        small = large % small;
        large = temp;
        }
        return large;
    }
}
