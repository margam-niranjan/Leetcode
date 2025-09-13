class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int count[] = new int[value];
        for(int num : nums){
            count[(num % value + value) % value]++;
        }
        int m = 0;
        while(true){
            if(count[m%value] > 0){
                count[m%value]--;
            }
            else return m;
            m++;
        }
        
    }
}