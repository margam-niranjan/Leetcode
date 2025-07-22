class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length ;
        boolean[] seen = new boolean[10001];
        int left = 0;
        int currSum = 0;
        int max = 0;
        for(int right = 0; right < nums.length ; right++){
            while(seen[nums[right]]){
                currSum -= nums[left];
                seen[nums[left]] = false;
                left++;
            }
            currSum += nums[right];
            seen[nums[right]] = true;
            max = Math.max(max, currSum);
        }
        return max;
    }
}