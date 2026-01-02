class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for(int i = 0 ; i < s.length(); i++){
            res += Math.abs((s.charAt(i) - 'a')-26) * (i+1); 
        }
        return res;
    }
}