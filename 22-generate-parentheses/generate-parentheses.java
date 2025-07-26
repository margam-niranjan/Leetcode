class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(new StringBuilder(), n, n);
        return res;
    }
    public void dfs(StringBuilder str, int left, int right){
        if(right ==0 && left == 0){
            res.add(str.toString());
        }
        if(left > right || left< 0 || right < 0) {
            return;
        }
        str.append('(');
        dfs(str,left - 1,right);
        str.deleteCharAt(str.length()-1);
        str.append(')');
        dfs(str,left,right-1);
        str.deleteCharAt(str.length()-1);
    }
}