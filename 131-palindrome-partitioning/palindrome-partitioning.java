class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(s, new ArrayList<>(), res);
        return res;
    }
    void backtrack(String s, List<String> current, List<List<String>> res){
        
        if(s.length() == 0) {
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0 ; i<s.length() ;i++){
            String curr = s.substring(0,i+1);
            if(isPalindrome(curr)){
                current.add(s.substring(0,i+1));
                backtrack(s.substring(i+1,s.length()) , current, res);
                current.remove(current.size()-1);
            }
        }
    }
    boolean isPalindrome(String s){
        int l = 0 , r = s.length()-1;
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