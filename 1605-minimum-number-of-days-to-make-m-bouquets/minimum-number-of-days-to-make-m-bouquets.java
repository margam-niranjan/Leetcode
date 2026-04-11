class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length){
            return -1;
        }
        int l = Integer.MAX_VALUE, r = Integer.MIN_VALUE;
        for(int i : bloomDay){
            l = Math.min(i, l);
            r = Math.max(i, r);
        }
        int ans = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(countBoq(bloomDay, m, k, mid)){
                ans = mid;
                r = mid -1;
            }
            else l = mid + 1;
        }

        return ans;
    }
    boolean countBoq(int[] nums, int m, int k,int day){
        int numOfBoq=0;
        int count = 0;
        for(int i = 0 ; i<nums.length ; i++){
           if (nums[i] <= day) {
                count++;
                if (count == k) {
                    numOfBoq++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return numOfBoq >= m;
    }
}