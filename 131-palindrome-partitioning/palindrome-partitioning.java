class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), res);
        return res;
    }
    void backtrack(String s, int ind, List<String> current, List<List<String>> res){
        
        if(s.length() == ind) {
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i = ind ; i<s.length() ;i++){
            if(isPalindrome(s,ind,i)){
                current.add(s.substring(ind,i+1));
                backtrack(s, i+1 , current, res);
                current.remove(current.size()-1);
            }
        }
    }
    boolean isPalindrome(String s,int l, int r){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}