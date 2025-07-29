class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int n =  nums.length;
        long sum = 0;
        for(int i=n/3; i<n; i+=2){
            sum+=(nums[i]*1L);
        }
        return sum;

    }
}