class Solution {
    public List<List<Integer>> generate(int nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i<nums ; i++){
            ans.add(helper(i));
        }
        return ans;
    }
    public List<Integer> helper(int num){
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i<=num ; i++){
            long x = 1;
            for(int j = 0 ; j<i; j++){
                x *= (num - j);
                x /= (j+1);
            }
            ans.add((int)x);
        }
        return ans;
    }
}