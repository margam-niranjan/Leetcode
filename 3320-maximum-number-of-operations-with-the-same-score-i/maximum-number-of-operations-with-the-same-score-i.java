class Solution {
    public int maxOperations(int[] nums) {
        int i = 2; 
        int count = 1;
        int check = nums[0] + nums[1];
        while(i<nums.length - 1 ){
           if(nums[i] + nums[i+1] == check) count++; 
           else return count;
           i+=2;
        }
        return count;
    }
}