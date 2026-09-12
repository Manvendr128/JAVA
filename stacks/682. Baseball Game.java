class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<arr.length;i++){
            String s = arr[i];
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                st.push(2 * st.peek());
            }
            else if(s.equals("+")){
                int top = st.peek();
                st.pop();
                int sum = top + st.peek();
                st.push(top);
                st.push(sum);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int totalsum = 0;
        while(st.size()>0){
            totalsum = totalsum + st.peek();
            st.pop();
        }
        return totalsum;
    }
}
