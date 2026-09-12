class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        nge[n-1] = -1;
        st.push(arr[n-1]);
        for(int i = n-2;i>=0;i--){
            st.push(arr[i]);
        }
        for(int i = n-1;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
}
