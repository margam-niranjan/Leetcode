class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0,product = 1;
        for(int i : nums){
            if(i == 0) zeroCount++;
            else product *= i;

        }
        if(zeroCount >= 2){
            Arrays.fill(nums,0);
            return nums;
        }
        if(zeroCount == 1){
            for(int i = 0 ; i<nums.length ; i++){
                if(nums[i] == 0) nums[i] = product;
                else nums[i] = 0;
            }
            return nums;
        }
        else{
             for(int i = 0 ; i<nums.length ; i++){
                nums[i] =  product / nums[i];
            }
        }
        return nums;

    }
}