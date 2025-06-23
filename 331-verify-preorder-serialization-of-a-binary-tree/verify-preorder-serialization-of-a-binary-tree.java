class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] str = preorder.split(",");
        int count = 1;
        for(String s : str){
            if(--count < 0) return false;
            if(!s.equals("#")) count += 2;
        }
        return count == 0;
    }
}