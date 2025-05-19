class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        findPermute(0,nums,res);
        return res;
    }
    public void findPermute(int ind,int[] nums, List<List<Integer>> res){
        if(ind==nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i =ind ; i<nums.length;i++){
            swap(i,ind,nums);
            findPermute(ind+1,nums,res);
            swap(i,ind,nums);
        }
    }
    public void swap(int i,int ind, int[] arr){
        int temp = arr[i];
        arr[i] = arr[ind];
        arr[ind] = temp;
    }
}