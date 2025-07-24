class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 1,count = 0, prev= Integer.MIN_VALUE;
        if(nums.length==0) return 0;
        for(int i : nums){
            if(prev == i){
                continue;
            }
            if(i == prev + 1) {
                count++;
                prev = i;
            }
            else{
                count = 1;
                prev = i;
            }
            max = Math.max(count,max);
            
        }
        return max;
    }
}