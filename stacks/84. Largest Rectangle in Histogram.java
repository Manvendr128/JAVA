//class Solution {
//    public int largestRectangleArea(int[] arr) {
//        int n = arr.length;
//        int[] nse = new int[n];
//        int[] pse = new int[n];
//        nse[n-1] = n;
//        Stack<Integer> st1 = new Stack<>();
//        Stack<Integer> st2 = new Stack<>();
//        st1.push(n-1);
//        for(int i = n-2;i>=0;i--){
//            while(st1.size()>0 && arr[st1.peek()]>=arr[i]){
//                st1.pop();
//            }
//            if(st1.size()==0){
//                 nse[i] = n;
//            }
//            else{
//            nse[i] = st1.peek();
//            }
//            st1.push(i);
//        }
//        st2.push(0);
//        pse[0] = -1;
//        for(int i = 1;i<n;i++){
//            while(st2.size()>0 && arr[st2.peek()]>=arr[i]){
//                st2.pop();
//            }
//            if(st2.size()==0){
//                pse[i] = -1;
//            }
//            else{
//            pse[i] = st2.peek();
//            }
//            st2.push(i);
//        }
//        int maxarea = 0;
//        for(int i = 0;i<n;i++){
//            maxarea = Math.max(maxarea,arr[i]*(nse[i] - pse[i] -1));
//        }
//        return maxarea;
//    }
//}
