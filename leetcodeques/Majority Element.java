// class Solution {
//     public int majorityElement(int[] arr) {
//         int n = arr.length;
//         // int c = 0;
//         int m = n/2;
//         // int i = 0;
//         for(int i = 0;i<n;i++){
//             int c = 0;
//             for(int j = i;j<n;j++){
//                 if(arr[j] == arr[i]){
//                     c++;
//                 }
//             }
//             if(c>m){
//                 return arr[i];
//             }
//         }
//         return 0;
//     }
// }
