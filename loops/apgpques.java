package loops;
import java.util.Scanner;
public class apgpques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        n terms print krni hai
//        n iterations
        for(int i = 2; i<=3*n-1; i+=3){
            System.out.println(i);
        }
//        for(int j = 2; j<=n; j+=3){
//            System.out.print(2+(j-1)*3 + " ");
//        }
//        always apply kregi ye cheej;;;
        int a = 2,d = 3;
        for(int i = 1; i<=n; i++){
            System.out.print(a + " ");
            a+=d;
        }
    }
}
