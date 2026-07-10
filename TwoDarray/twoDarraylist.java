package TwoDarray;

import java.util.ArrayList;

public class twoDarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);a.add(2);a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);b.add(5);b.add(6);b.add(19);



        ArrayList<Integer> c = new ArrayList<>();
        c.add(8);c.add(9);c.add(11);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(a);list.add(b);list.add(c);
        System.out.println(list);




    }
}
