class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = max(piles);
        int ans = r;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(canFinish(piles,h,mid)){
                ans = mid;
                r = mid - 1;
            }
            else l = mid + 1;
        }
        return ans;
    }
    public int max(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            max = Math.max(max,i);
        }
        return max;
    }
    public boolean canFinish(int[] piles, int h, int k){
        long hours = 0;
        for(int i : piles){
            hours += i/k;
            if(i%k != 0 ) hours++;
        }
        return hours <= h;
    }
}