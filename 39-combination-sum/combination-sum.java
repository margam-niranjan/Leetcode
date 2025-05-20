class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> can = new ArrayList<>();
        findComb(nums,0,target,can,res);
        return res;
    }
    public void findComb(int[] nums,int ind,int target,List<Integer> can,List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(can));
            return;
        }
        if(ind>=nums.length || target < 0){
            return;
        }
        can.add(nums[ind]);
        findComb(nums,ind,target-nums[ind],can,res);
        can.remove(can.size()-1);
        findComb(nums,ind+1,target,can,res);
        

    }
}