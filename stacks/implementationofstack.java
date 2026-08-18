package stacks;
import java.util.*;

class Node{
    Node next;
    int val;
    Node (int val){
        this.val = val;
    }
}
class stack{
    Node head;
    int len;
    int peek() throws Exception{
        if(head==null){
//            System.out.print("Stack underflow");
            throw new Exception("stack underflow");
        }
            return head.val;
    }
    void pop(){
        if(head==null){
            System.out.println("stack underflow");
        }
        else {
            int x = head.val;
            head = head.next;
            len--;
//            return x;
        }
    }

    void push(int ele){
        Node temp = new Node(ele);
        if(len==0){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }
    void display(){
        Node temp =  head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
    int size(){
        return len;
    }
}

public class implementationofstack {
    public static void main(String[] args) throws Exception{
        stack st = new stack();
//        st.peek();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println(st.peek());
        st.pop();
        System.out.println();
        st.display();

    }
}
