class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        findPermute(0,nums,res);
        return res;
    }
    public void findPermute(int ind, int[] nums, List<List<Integer>> res){
        if(ind == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num : nums){
                temp.add(num);
            }
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = ind;i<nums.length;i++){
            swap(ind,i,nums);
            findPermute(ind+1,nums,res);
            swap(ind,i,nums);
        }
    }
    public void swap(int ind,int i,int[] arr){
        int t = arr[ind];
        arr[ind] = arr[i];
        arr[i]=t;
    }
}