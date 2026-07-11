class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int j = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]!=j){
                return j;
            }
            j++;
        }
        return j;
        
    }
}
