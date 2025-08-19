class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0, max = 0;
        for (int num : nums) {
            max = (num == 0) ? max + 1 : 0;
            cnt += max;
        }
        return cnt;
    }
}