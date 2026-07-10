package arrays;

import java.util.Arrays;

public class shallowcopy {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
//        x and y alg alg  variable hai
        int[] a = {1,2,3,4};
//        int[] b = {5,6,7,8};
        //b & a same array ko point kar rhe hai
        int[] b = a;
        b[0] = 20; // ye hai shallow copy
        System.out.println(a[0]);
        int[] c = Arrays.copyOf(a,a.length); // c is an entirely new array and copy of array a
        c[1] = 20;
        // c me change hua hai kuki woo nyi A me change nhin hoga
        System.out.println(a[1]);
        // a ki copy d me dusre methid se
        int[] d = new int[a.length];
        for(int i =0;i<a.length;i++){
            d[i] = a[i];
        }

    }
}
