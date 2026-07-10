package arrays;
import java.util.*;
public class passingarraytomeathod {
    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        System.out.println(x[0]);
        change(x);
        System.out.println(x[0]);


    }
    private static void change(int[] y){
//        x[0] = 20;
         y[0] = 20;
    }
}
