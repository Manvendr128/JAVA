package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class removeaddpeekanyposition {
    public static void display(Queue<Integer> q){
        for(int i = 0;i<q.size();i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
    }

    public static void addatindex(Queue<Integer> q, int idx,int val){
        int n = q.size();
        for(int i = 1;i<=idx;i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i = 1;i<=(n-idx);i++){
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
//        display(q);
        addatindex(q,2,60);
        display(q);
    }
}
