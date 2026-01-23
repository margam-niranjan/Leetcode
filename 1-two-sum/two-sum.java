class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmm = new HashMap<>();
        hmm.put(nums[0],0);
        for(int i = 1 ; i<nums.length ; i++){
            int tar = target - nums[i];
            if(hmm.containsKey(tar)){
                return new int[]{hmm.get(tar),i};
            }
            hmm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}