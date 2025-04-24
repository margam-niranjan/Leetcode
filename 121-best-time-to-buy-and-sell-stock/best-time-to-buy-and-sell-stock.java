class Solution {
    public int maxProfit(int[] arr) {
        int min = arr[0];
        int max = 0;
        for(int i = 1 ; i<arr.length;i++){
            max = (max>arr[i]-min)?max:(arr[i]-min);
            min = (min<arr[i])?min:arr[i];
        }
        return max;
    }
}