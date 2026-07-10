package loops;
import java.util.*;
public class forloops {
    public static void main(String[] args) {
        System.out.println("monu");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = 1;i<=n;i+=2){
//            System.out.println(i);
//        odd number divide by three---
        for (int i = 1;i<=n;i+=2){
            if(i%3==0){
                System.out.println(i);
            }

//          print even numbers AND 2nd method
//            if(i%2==0){
//                System.out.println(i);
//            }
        }
    }
}
