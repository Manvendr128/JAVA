package TwoDarray;

import java.util.*;

public class rowwithmaxsum {
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
        int m = arr.length;
        int n = arr[0].length;

//        int[][] arr = {{1,2,3},{33,11,2},{67,55,34}};
        int maxsum = Integer.MIN_VALUE;
        int row  = 0;
        for ( int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum+=arr[i][j];
                row = i;
            }
            if(sum > maxsum){
                maxsum = sum;
                row = i;
            }
        }
        System.out.println(maxsum );
        System.out.println(row); // row kaa index print kra dega


    }
}
