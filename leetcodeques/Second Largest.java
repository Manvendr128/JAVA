class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        if(n==0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                secmax = max;
                max = arr[i];
            }
            else if(max>arr[i]&&arr[i]>secmax){
                secmax = arr[i];
            }
        }
        if(secmax==Integer.MIN_VALUE){
            return -1;
        }
        return secmax;
    }
}
