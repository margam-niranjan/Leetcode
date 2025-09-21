class Solution {
    public int[] transformArray(int[] nums) {
        int odd = 0 ;
        for(int i : nums){
            if(i % 2 != 0 ){
                odd++;
            }
        }
        Arrays.fill(nums,0);
        int n = nums.length;
        for (int i = n - odd; i < n; i++) {
            nums[i] = 1;
        }
        return nums;
    }
}