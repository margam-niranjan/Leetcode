class Solution {
    public void reverseString(char[] s) {
        swap(s,0,s.length - 1);
    }
    void swap(char[] s, int i , int j){
        while(i<j){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
    }
}