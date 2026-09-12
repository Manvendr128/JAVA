class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n =  arr.length;
        Stack<Integer> st = new Stack<>();
        int[] span = new int[n];
        span[0] = 1;
        st.push(0);
        for(int i = 1;i<n;i++){
            while(st.size()>0 && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0) span[i] = i - (-1);
            else{
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        ArrayList ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            ans.add(span[i]);
        }
        return ans;
    }
}
