package TwoDarray;

import java.util.*;

public class rotatebynintydegree {
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
        for(int i = 1;i<r;i++){
            for(int j = 0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int j = 0;j<c;j++){
            for(int i = r-1;i>=0;i--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
