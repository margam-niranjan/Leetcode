class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int r = 0,l =0;
        for(int i : weights){
            r += i;
            l = Math.max(i, l);
        }
        int ans = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(calculate(weights, days, mid)){
                ans = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
        
    }
    boolean calculate(int[] nums, int days, int capacity){
        int count = 1,load = 0;
        for(int i : nums){
            if(load + i > capacity){
                count++;
                load = i;
            }
            else{
                load += i;
            }
        }
        return count <= days;
    }
}