class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        findSubset(0,new ArrayList<>(),nums,res);
        return res;
    }
    public void findSubset(int index, List<Integer> current, int[] nums, List<List<Integer>> res){
        if(index == nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        findSubset(index+1, current, nums, res);
        current.add(nums[index]);
        findSubset(index+1,current,nums,res);
        current.remove(current.size()-1); 
    }
}