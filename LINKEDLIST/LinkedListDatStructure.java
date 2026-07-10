package LINKEDLIST;
class Node { // user defined data types
    int val;
    Node next; // default value null
    Node(int x){
        val = x;
    }
}
class Linkedlist{ // user defined data structure
    Node head; // by default null
    Node tail;
    int size;
    //INSERTATINDEX
    void inseratidx(int x,int val) {
        if (x < 0 || x > size) {
            System.out.println("Can not insert");
            return;
        }
        else if (x == 0) {
            addfirst(val);
        }
        else if (x == size) {
            addtail(val);

        } else{
            Node temp = head;
            for(int i =1;i<x;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    //SEARCH
    int search(int x) {
        if (head == null) {
            return -1;
        }
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == x) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    //INSERTATAIL
    void addtail(int x){
        Node temp = new Node(x);
        if(tail==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;

    }
    //INSERTATFIRST
    void addfirst(int x){
        Node temp = new Node(x);
        if(head==null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    //DELETEATHEAD
    void deletehead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if(head==null) tail = null;
        size--;

    }
    //FORDISPLAY
    void display(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println(size);
    }
    //DELETEATIDX
    void delete(int idx){
        if(idx<0||idx>=size){
            System.out.println("invalid index");
            return;
        }
        if(idx==0){
            deletehead();
            return;
        }
        Node temp = head;
        for(int i = 1;i<idx;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx==size-1){
            tail = temp;
        }
        size--;
    }
}

public class LinkedListDatStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.deletehead();
        ll.addtail(10);
        ll.addtail(20);
        ll.addtail(30);
        ll.addtail(40);
        ll.addtail(50);
        ll.display();
        ll.addfirst(55);
        ll.display();
        ll.deletehead();
        ll.display();
        System.out.println(ll.search(30));
        ll.display();
        ll.inseratidx(2,40);
        ll.display();
        ll.delete(3);
        ll.display();
    }
}
