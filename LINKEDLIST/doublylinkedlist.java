package LINKEDLIST;
class ListNode { // user defined data types
    int val;
    ListNode next;
    ListNode prev;// default value null
    ListNode(int x){
        val = x;
    }
}
class dll{
    ListNode head;
    ListNode tail;
    int size;
    //INSERT AT HEAD
    void insertathead(int val){
        ListNode temp = new ListNode(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    //INSERT AT TAIL
    void insertattail(int val){
        ListNode temp = new ListNode(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    //DELETE AT HEAD
    void deleteathead(){
        if(size==0){
            System.out.println("List is empty");
            return;
        }
        if(size==1){
            head=tail=null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    //DELETE AT TAIL
    void deleteattail(){
        if(size==0){
            System.out.println("List is empty");
            return;
        }
        if(size==1){
            head=tail=null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    //DISPLAY
    void display(){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    //DISPLAY REVERSE
    void displayrevrse(){
        ListNode temp = tail;
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    //INSERT AT ANY INDEX
    void insertatindex(int idx,int val){
        ListNode a = new ListNode(val);
        if(idx<0||idx>size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0) {
            insertathead(val);
            return;
        }
        if(idx==size){
            insertattail(val);
        }
        ListNode temp = head;
        for(int i = 0;i<idx-1;i++){
            temp = temp.next;
        }
        ListNode b = temp.next;
        temp.next = a;
        a.prev = temp;
        a.next = b;
        b.prev = a;
    }

}
public class doublylinkedlist {
    public static void main(String[] args) {
        dll list = new dll();
        list.insertathead(10);
        list.insertathead(20);
        list.insertathead(30);
        list.insertathead(40);
        list.insertathead(50);
        list.display();
        list.insertattail(90);
        list.display();
        list.displayrevrse();
        list.deleteathead();
        list.deleteattail();
        list.display();
    }
}
