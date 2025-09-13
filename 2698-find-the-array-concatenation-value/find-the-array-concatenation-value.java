class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int l = 0 , r = nums.length - 1;
        String temp ="";
        long res = 0;
        while(l<=r){
            if(l==r){
                temp = String.valueOf(nums[l]);
            }
            else{
                temp = String.valueOf(nums[l]) + String.valueOf(nums[r]);
            }
            res += Integer.parseInt(temp);
            l++;
            r--;
        }
        return res;
    }
}