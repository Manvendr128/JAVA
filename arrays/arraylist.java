package arrays;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        System.out.println(arr.size());
        arr.add(10);arr.add(20);arr.add(30);arr.add(40);
        System.out.println(arr.size());

        // print
        for(int i = 0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();
        arr.add(90);arr.add(200);arr.add(300);arr.add(50);

        System.out.println(arr.size());

        arr.remove(4); // remove element kaise krte hai
        System.out.println(arr.size());

        System.out.println(arr);

        //replace index value
        arr.set(2,3);
        System.out.println(arr);

        //reverse array list
        int i = 0,j = arr.size() - 1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);

//  reverse krane kaa shortcut tarika
        Collections.reverse(arr);
        System.out.println(arr);

        // sorting in array
        Collections.sort(arr);
        System.out.println(arr);
    }
}
