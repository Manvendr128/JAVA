package stacks;
import java.util.*;

public class pushelementatbottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int ele = 50;
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        pushatbottom(st,ele);
        System.out.println(st);
    }

    public static void pushatbottom(Stack<Integer> st, int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushatbottom(st,ele);
        st.push(top);
    }
}
