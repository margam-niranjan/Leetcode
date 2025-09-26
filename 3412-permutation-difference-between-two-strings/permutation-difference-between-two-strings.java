class Solution {
    public int findPermutationDifference(String s, String t) {
        int diff = 0 ;
        int[] pos = new int[26];
        for (int i = 0; i < s.length() ; i++) {
            pos[s.charAt(i) - 'a'] = i;
        }
        for(int i = 0 ; i<s.length() ; i++){
            diff += Math.abs(pos[t.charAt(i) - 'a'] - i);
        }
        return diff;
    }
}