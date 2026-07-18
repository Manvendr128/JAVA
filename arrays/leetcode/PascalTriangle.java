//class Solution {
//    public List<List<Integer>> generate(int n) {
//        List<List<Integer>> total = new ArrayList<>();
//        for(int i = 0;i<n;i++){
//            List<Integer> row = new ArrayList<>();
//            for(int j = 0;j<=i;j++){
//                if(j==0||j==i){
//                    row.add(1);
//                }
//                else{
//                    row.add(total.get(i-1).get(j-1)+total.get(i-1).get(j));
//                }
//            }
//            total.add(row);
//        }
//        return total;
//    }
//}