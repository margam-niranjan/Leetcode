class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max = -1;
        for(int i = 0 ; i<nums.length; i++){
            for(int j = i ; j<nums.length ; j++){
                if((nums[i]^nums[j])>max && Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j]))
                {
                    max=nums[i]^nums[j];
                }
            }
        }
        return max;
    }
}