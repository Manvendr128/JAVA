package ques;
import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int r = 0;
            int o = n;
            while(n!=0){
                r = r*10;
                r = r + n%10;
                n = n/10;

            }
        System.out.print(r + o);
    }
}
