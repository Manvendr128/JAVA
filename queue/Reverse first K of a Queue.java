// class Solution {
//     public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
//         // code here
//         int c = 0;
//         int n = q.size();
//         if(k>n){
//             return q;
//         }
//         Stack<Integer> st = new Stack<>();
//         while(c<k){
//             st.push(q.remove());
//             c++;
//         }
//         while(st.size()>0){
//             q.add(st.pop());
//         }
//         int m = 0;
//         while(m<(n-k)){
//             q.add(q.remove());
//             m++;
//         }
//         return q;
//     }
// }
