class Solution {
    public int findNumbers(int[] nums) {
        int c=0,m,k=0;
        for(int i=0;i<nums.length;i++){
            m=nums[i];
            while(m!=0){
                c++;
                m/=10;
            }
            if(c%2==0)k++;
            c=0;
        }
        return k;
    }
}