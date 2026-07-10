package patternprint;
import java.util.*;
public class squarepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for rows = n
        int n = sc.nextInt();
//        for column = m
        int m = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
//        System.out.println();

    }
}
