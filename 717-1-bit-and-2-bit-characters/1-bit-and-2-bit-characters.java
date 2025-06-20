class Solution {
    public boolean isOneBitCharacter(int[] nums) {
        int i =0;
        for(i = 0; i<nums.length -1; i++){
            if(nums[i]==1)i++;
        }
        return i==nums.length-1;
    }
}