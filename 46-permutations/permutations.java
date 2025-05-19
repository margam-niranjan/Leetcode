class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        findPermute(nums,ds,ans,freq);
        return ans;
    }
    public void findPermute(int[] nums,List<Integer> ds, List<List<Integer>> ans,boolean[] freq){
        if(nums.length == ds.size()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0 ;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                findPermute(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                findPermute(nums,ds,ans,freq);
                freq[i] = false;
            }
        }
    }
}