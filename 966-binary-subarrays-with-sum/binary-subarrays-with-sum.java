class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    private int atMost(int[] nums, int S) {
        if (S < 0) return 0;
        int left = 0, right = 0, sum = 0, count = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (sum > S) {
                sum -= nums[left];
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }
}