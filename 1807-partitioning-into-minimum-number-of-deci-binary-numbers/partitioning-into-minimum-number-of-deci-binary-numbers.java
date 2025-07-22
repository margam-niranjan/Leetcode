class Solution {
    public int minPartitions(String n) {
        int max= -1;
        for(char ch : n.toCharArray()){
            max = Math.max((int)ch-'0', max);
        }
        return max;
    }
}