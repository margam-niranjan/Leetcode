class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
       List<List<Integer>> res = new ArrayList<>();
       Arrays.sort(nums);
       findCombination(nums,0,target,new ArrayList<>(),res);
       return res;
    }
    public void findCombination(int[] nums, int index,int target, List<Integer> curr, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
         for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            
            if (nums[i] > target) break; 

            curr.add(nums[i]);
            findCombination(nums, i + 1, target - nums[i], curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}