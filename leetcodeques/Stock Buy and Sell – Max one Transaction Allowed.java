// class Solution {
//     public int maxProfit(int[] arr) {
//         int n = arr.length;
//         int[] min = new int[n];
//         int[] max = new int[n];
//         min[0] = arr[0];
//         for(int i = 1;i<n;i++){
//             min[i] = Math.min(min[i-1],arr[i]);
//         }
//         max[n-1] = arr[n-1];
//         for(int i = n-2;i>=0;i--){
//             max[i] = Math.max(max[i+1],arr[i]);
//         }
//         int maxp = 0;
//         for(int i = 0 ;i<n;i++){
//             maxp = Math.max(maxp,max[i]-min[i]);
//         }
//         return maxp;
    
//     }
// }
