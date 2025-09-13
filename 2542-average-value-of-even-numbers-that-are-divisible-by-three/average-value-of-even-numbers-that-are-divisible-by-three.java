class Solution {
    public int averageValue(int[] nums) {
        int ans = 0, count = 0;
        for(int n : nums){
            if(n % 6 == 0) {
                count ++;
                ans += n;
            }
        }
        count = (count == 0)? 1 : count;
        return (int)ans/count;
    }
}