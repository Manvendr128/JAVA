package patternprint;
import java.util.*;
public class alphabetpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i = 1;i<=n;i++) {
            for (int j = 1; j <= n; j++) { //columns
//                System.out.print((char)(j + 64) + " "); A B C D... IS TYPE KAA PATTERN PRINT HOGA ISSE
                System.out.print((char)(i + 96) + " ");
            }
            System.out.println();
        }
    }
}
