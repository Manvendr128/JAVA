package OOPS;
class arryalist{
    int[] arr;
    int idx = 0;
    int size = 0;
    arryalist(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        arr[idx++] = ele;
        size++;

    }
    int capacity(){
        return arr.length;
//        System.out.println(arr.length);
    }
    void display(){
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
public class ownarraylist {
    public static void main(String[] args) {
        arryalist arr = new arryalist(8);
        System.out.println(arr.capacity());
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr.size);
        arr.display();

    }
}
