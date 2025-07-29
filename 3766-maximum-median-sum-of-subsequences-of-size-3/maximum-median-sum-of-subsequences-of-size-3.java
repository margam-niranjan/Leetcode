class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int i =0 , j = nums.length -1;
        long sum = 0;
        while(i<j){
            sum += nums[j-1];
            i++;
            j-=2;
        }
        return sum;

    }
}