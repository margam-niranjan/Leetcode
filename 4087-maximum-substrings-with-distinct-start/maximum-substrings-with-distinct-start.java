class Solution {
    public int maxDistinct(String s) {
        boolean[] used = new boolean[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';

            if (!used[ch]) {
                used[ch] = true;
                count++;
            }
        }
        return count;
    }
}
