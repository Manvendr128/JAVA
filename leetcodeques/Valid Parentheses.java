// class Solution {
//     public boolean isValid(String s) {
//         int n = s.length();
//         if(n%2!=0){
//             return false;
//         }
//         Stack<Character> st = new Stack<>();
//         for(int i = 0;i<n;i++){
//             char b = s.charAt(i);
//             if(b=='(' || b=='{' || b=='['){
//                 st.push(b);
//             }
//             else{
//                 if(st.size()==0) return false;
//                 char top = st.peek();
//                 if(!checkparenthesis(top,b)){
//                     return false;
//                 }
//                 st.pop();
//             }
//         }
//         return (st.size()==0);
//     }
//     public boolean checkparenthesis(char a,char b){
//         if(a=='{' && b=='}') return true;
//         else if(a=='[' && b==']') return true;
//         else if(a=='(' && b==')') return true;
//         else return false;
//     }
// }
