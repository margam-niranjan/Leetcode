class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];
        int max = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;

            while (freq[ch] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            max = Math.max(max, i - left + 1);
        }

        return max;
    }
}
