package LINKEDLIST;
//class Node {
//    int val;
//    Node next; // default value null
//    Node(int x){
//        val = x;
//    }
//}


public class DISPLAYLIST {
    public static void displayrec(Node head){
        if(head==null) return;
        displayrec(head.next);
        System.out.print(head.val + " ");
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next; // very important
        }
    }
    public static int get(Node head,int idx){
        Node temp = head;
        int c = 0;
        while(c!=idx){
            temp = temp.next;
            c++;
        }

        return temp.val;


    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

//        System.out.println(a.val);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        System.out.println();
        displayrec(a);
        System.out.println();

        System.out.println(get(a,2));

    }
}
