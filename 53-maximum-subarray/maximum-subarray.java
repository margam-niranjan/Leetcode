class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int num:nums){
            sum+=num;
            max = Math.max(sum,max);
            if(sum<0) sum = 0;
        }
        return max;
    }
}