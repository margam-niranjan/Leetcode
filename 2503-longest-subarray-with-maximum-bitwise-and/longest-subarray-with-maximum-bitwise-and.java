class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length == 0)return 0;
        int max = 0;
        for(int i : nums){
            max = Math.max(i,max);
        }
        int length = 0;
        int curr = 0;
        for(int i : nums){
            if(i == max){
                curr++;
            }
            else{
                length = Math.max(length,curr);
                curr = 0;
            }
        }
        return Math.max(length,curr);
    }
}