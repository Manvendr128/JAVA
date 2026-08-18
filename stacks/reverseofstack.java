package stacks;

import java.util.Stack;

public class reverseofstack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int ele = 50;
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        reverse(st);
        pushatbottom(st,top);
    }
    public static void pushatbottom(Stack<Integer> st, int ele){
        if(st.size()==0) {
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushatbottom(st,ele);
        st.push(top);
    }
}
