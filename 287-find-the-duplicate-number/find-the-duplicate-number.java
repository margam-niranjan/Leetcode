class Solution {
    public int findDuplicate(int[] nums) {
        for(int n: nums){
            int ind = Math.abs(n) -1;
            if(nums[ind]<0) return Math.abs(n);
            nums[ind] *= -1;
            
        }
        return -1;
    }
}