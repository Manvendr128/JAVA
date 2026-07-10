package TwoDarray;

import java.sql.SQLOutput;
import java.util.Scanner;

public class rowwisesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
//        int row = 0;
//        for(int i = 0;i<r;i++){
//            int row = 0;
//            for(int j = 0;j<c;j++){
//                row = arr[i][j] + row;
//            }
//            System.out.println(row);
//        }
//        System.out.println();
        int sum = 0;
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                sum = arr[i][j] + sum;
            }
//            System.out.println(row);
        }
        System.out.println(sum);
        for(int i = 0;i<r;i++){
            int column = 0;
            for(int j = 0;j<c;j++){
                column = arr[i][0] + column;
            }
            System.out.println(column);
        }
        System.out.println();
    }
}
