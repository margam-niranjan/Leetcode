class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length -1;
        swap(s,i,j);
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