class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0, r = 0;
        for(int i:nums){
            l = Math.max(l, i);
            r += i;
        }
        int number = 0;
        while(l<=r){
            int mid = l+(r-l) / 2;
            number = function(nums, mid);
            if(number > k) l = mid + 1; 
            else r = mid - 1;
        }
        return l;
    }

    int function(int[] nums, int n){
        int subArrays = 1;
        int sum = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(sum + nums[i] <= n){
                sum += nums[i];
            }
            else{
                subArrays+= 1;
                sum = nums[i];
            }
        }
        return subArrays;
    }
}