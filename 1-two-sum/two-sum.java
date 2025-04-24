class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmm = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ;i<nums.length;i++){
            int ele = target - nums[i];
            if(hmm.containsKey(ele)){
                return new int[]{i,hmm.get(ele)};
            }
            hmm.put(nums[i],i);
        }
        return new int[]{};
    }
}