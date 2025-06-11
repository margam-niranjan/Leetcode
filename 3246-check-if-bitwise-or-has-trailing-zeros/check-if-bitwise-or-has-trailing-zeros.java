class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int even = 0 ;
        for(int num : nums){
            if(num%2 == 0) even++;
            if(even>1) return true;
        }
        return false;
    }
}