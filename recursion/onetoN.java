package recursion;
import java.util.*;

public class onetoN {
    static int n; // interview me ise nhi btayenge
    // two variable se pass krenge
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
//        one(1,n);
        print(n);
    }
    public static void print(int x){
        if(x==0) return;
        print(x-1);
        System.out.println(x + " ");
    }
//    public static void one(int x){
//        if(x>n) return;
//        System.out.println(x);
//        one(x+1);
//    }
//    public static void one(int x , int n){
//        if(x>n) return;
//        System.out.println(x);
//        one(x+1,n);
//
//    }
}
