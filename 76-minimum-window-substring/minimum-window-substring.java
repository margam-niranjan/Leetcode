class Solution {
    public String minWindow(String s, String t) {
        int right = 0, left = 0, startInd = -1, count = 0, minLen = Integer.MAX_VALUE;
        int[] arr = new int[256];

        for (char ch : t.toCharArray()) {
            arr[ch]++;
        }

        while (right < s.length()) {
            if (arr[s.charAt(right)] > 0) count++;
            arr[s.charAt(right)]--;

            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startInd = left;
                }

                arr[s.charAt(left)]++;  
                if (arr[s.charAt(left)] > 0) count--; 
                left++;
            }

            right++;
        }

        return startInd == -1 ? "" : s.substring(startInd, startInd + minLen);
    }
}
