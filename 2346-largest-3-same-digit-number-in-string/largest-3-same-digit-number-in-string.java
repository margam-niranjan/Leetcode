class Solution {
    public String largestGoodInteger(String num) {
       String[] subStr = {"000", "111", "222", "333", "444", "555", "666", "777", "888", "999"};
       int count = 0;
       for(int i = subStr.length - 1; i>=0; i--){
        if(num.contains(subStr[i])) return subStr[i];
       }
       return "";
    }
}