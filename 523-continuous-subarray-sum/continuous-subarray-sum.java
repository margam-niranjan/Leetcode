class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> hmm = new HashMap<>();
        hmm.put(0,-1);
        int sum = 0;
        for(int i =0 ; i<nums.length ; i++){
            sum += nums[i];
            int remainder = sum % k;
            if(hmm.containsKey(remainder)){
                if(i - hmm.get(remainder) > 1) return true;
            }
            else
                hmm.put(remainder,i);
        }
        return false;
    }
}