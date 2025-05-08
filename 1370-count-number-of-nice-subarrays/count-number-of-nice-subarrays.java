class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    public static int atmost(int[] nums,int k){
        if(k<0) return 0;
        int sum=0,left=0,right=0,count=0;
        while(right<nums.length){
            sum+=(nums[right]%2);
            while(sum>k){
                sum-=(nums[left]%2);
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
}