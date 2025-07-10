class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums,new ArrayList<>(),res);
        return res;
    }
    void helper(int[] nums,List<Integer> lst,  List<List<Integer>> res){
        if(lst.size() == nums.length) {
            res.add(new ArrayList<>(lst));
            return;
        }
        for(int i : nums){
            if(lst.contains(i)) continue;
            lst.add(i);
            helper(nums,lst,res);
            lst.remove(lst.size()-1);
        }
    }

}