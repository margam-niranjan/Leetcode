class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[256];
        if(s.length() != t.length()) return false;
        for(char ch : s.toCharArray()){
            arr[ch]++;
        }
        for(char ch : t.toCharArray()){
            arr[ch]--;
        }
        for(int i : arr){
            if(i != 0) return false;
        }
        return true;
    }
}