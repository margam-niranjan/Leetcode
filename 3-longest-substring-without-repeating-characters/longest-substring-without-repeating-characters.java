class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int j = 0,i = 0,max = 0;
        while(i<s.length()){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
                i++;
                max = Math.max(max, i - j);
            }
            else{
                hs.remove(s.charAt(j));
                j++;
            }
        }
        return max;
    }
}