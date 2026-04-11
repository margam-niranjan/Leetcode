class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1, r = max(nums);
        int ans = -1;
        while(l<=r){
            int mid = l + (r - l)/2;
            if(satisfies(nums,threshold,mid)){
                ans = mid;
                r = mid - 1;
            }
            else l = mid + 1;
        }
        return ans;
    }
    public int max(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i: nums){
            max = Math.max(i,max);
        }
        return max;
    }
    public boolean satisfies(int[] nums, int threshold, int num){
        int sum = 0;
        for(int i : nums){
            double d = Math.ceil((double)i/(double)num);
            sum += (int) d;
        }
        return sum<= threshold;
    }
}