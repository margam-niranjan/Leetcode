class Solution {
    public int maximumPossibleSize(int[] nums) {
        int size = 0 ;
        int prev = -1;
        for(int num : nums){
            if(num >= prev){
                prev = num;
                size++;
            }
        }
        return size;

    }
}