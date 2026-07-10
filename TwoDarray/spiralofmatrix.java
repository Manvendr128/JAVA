package TwoDarray;
import java.util.*;
public class spiralofmatrix {
    public ArrayList<Integer> spirallytransverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;
        int sr = 0, er= row-1 , sc = 0, ec = col - 1;
        while(sr<=er && sc<=ec){
            //first row
            for(int j = sc;j<=ec;j++){
                ans.add(arr[sr][j]);
            sr++;
            if(sr>er || sc>ec) break;
            }
            // end col
            for(int i = sr;i<=er;i++){
                ans.add(arr[i][ec]);
            ec--;
            if(sr>er || sc>ec) break;
            }
            // end row(reverse)

            for(int i = ec;i>=sc;i--){
                ans.add(arr[i][er]);
            er--;
            if(sr>er || sc>ec) break;
            }

            //start col(reverse)
            for(int i = er;i>=er;i--){
                ans.add(arr[i][sc]);
            sc++;
            }
        }
        return ans;
    }


}
