package TwoDarray;
import java.util.*;
public class columnwiseprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int m = arr.length; // ye row dega
        int n = arr[0].length; // ye column dega
        for(int j = 0;j<n;j++){
            for (int i =0;i<m;i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
