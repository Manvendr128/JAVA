package TwoDarray;

import java.util.*;

public class snakepattern {
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
//        for (int i = 0;i<m;i++){
//            for(int j = 0;j<n;j++){7
//                if(i%2==1){
//                    for(j =n-1;j>=0;j--){
//                        System.out.print(arr[i][j] + " ");
//
//                    }
//                    break;
//                }
//                else{
//                    System.out.print(arr[i][j] + " ");
//                }
//            }
//            System.out.println();
//        }
        for(int i = 0;i<m;i++){
            if(i%2==0){
                for (int j = 0;j<n;j++){
                    System.out.print(arr[i][j] + " ");
                }

            }
            else{
                for (int j = n -1;j>=0;j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
