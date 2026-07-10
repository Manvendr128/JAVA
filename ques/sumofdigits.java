package ques;
import java.util.*;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
//        if(n == 0){
//            System.out.println(0);
//        }
        while(n!=0){
            s = s + n%10;
            n = n/10;
        }
        System.out.println(s);
    }
}
