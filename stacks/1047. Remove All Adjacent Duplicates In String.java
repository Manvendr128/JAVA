//import java.util.Stack;
//import java.util.ArrayList;
//
//class Solution {
//    public String removeDuplicates(String s) {
//        Stack<Character> st = new Stack<>();
//        st.push(s.charAt(0));
//        for(int i = 1;i<s.length();i++){
//            char ch = s.charAt(i);
//            if(st.size()>0 && st.peek() == ch){
//                st.pop();
//            }
//            else{
//                st.push(ch);
//            }
//        }
//        ArrayList<Character> arr = new ArrayList<>();
//        while(st.size()>0){
//            arr.add(st.peek());
//            st.pop();
//        }
//        StringBuilder ans = new StringBuilder();
//        for(int i = arr.size()-1;i>=0;i--){
//            ans.append(arr.get(i));
//        }
//
//        return ans.toString();
//    }
//}
