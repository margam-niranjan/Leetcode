class Solution {
    public int[] searchRange(int[] nums, int target) {
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i] == target){
                min = Math.min(min,i);
                max = Math.max(max,i);
            }
        }
        if(min == Integer.MAX_VALUE) min = -1;
        if(max == Integer.MIN_VALUE) max = -1;
        return new int[]{min,max};
    }
}