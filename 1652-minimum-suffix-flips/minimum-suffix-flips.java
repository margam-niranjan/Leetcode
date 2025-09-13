class Solution {
    public int minFlips(String target) {
        int n = target.length();
        char exp = '0';
        int count = 0;
        for(int i = 0  ; i<n ; i++){
            if(target.charAt(i) != exp) count++;
            exp = target.charAt(i);
        }
        return count;
    }
}