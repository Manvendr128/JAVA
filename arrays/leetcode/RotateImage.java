//class Solution {
//    public void rotate(int[][] matrix) {
//        int row = matrix.length;
//        int col = matrix[0].length;
//        for(int i = 0;i<row;i++){
//            for(int j = i+1;j<col;j++){
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//        int l = col-1;
//        int first = 0;
//        for(int i = 0;i<row;i++){
//            l = col-1;
//            first= 0;
//            while(first<l){
//                int temp = matrix[i][first];
//                matrix[i][first] = matrix[i][l];
//                matrix[i][l] = temp;
//                l--;
//                first++;
//            }
//        }
//    }
//}