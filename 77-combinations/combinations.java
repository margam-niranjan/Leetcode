class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        findCombine(new ArrayList<>(),1,n,k,res);
        return res;
    }
    void findCombine(List<Integer> curr, int start, int n, int k, List<List<Integer>> res){
        if(curr.size() == k){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i =start ; i<=n;i++){
            curr.add(i);
            findCombine(curr, i+1, n,k,res);
            curr.remove(curr.size()-1);
        }
    }
}