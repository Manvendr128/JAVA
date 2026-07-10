package loops;
import java.util.*;
public class gpprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2,r = 3;
        for(int i = 1; i<=n;i++){
            System.out.println(a + " ");
            a*=r;
        }
        int b = 99;
        for(int i =b;i>=0;i-=4){
            System.out.println(i);
        }
    }
}
