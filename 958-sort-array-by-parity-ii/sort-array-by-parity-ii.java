class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd  = 1;
        while(odd<nums.length && even<nums.length){
            while(odd<nums.length && even<nums.length && nums[even] %2 == 0) even+=2;
            while(odd<nums.length && even<nums.length && nums[odd] % 2 != 0) odd+=2;
            if(even < nums.length && odd < nums.length){
                swap(nums,even,odd);
            }
        }
        return nums;
    }
    void swap(int[] nums,int even, int odd){
        int temp = nums[even];
        nums[even] = nums[odd];
        nums[odd] = temp;
    }
}