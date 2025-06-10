class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i<nums.length; i++){
            ArrayList<Integer> lst = new ArrayList<>();
            int val = nums[i];
            
            while(val>0){
                lst.add(val%10);
                val/=10;
            }
            for(int j = lst.size()-1 ; j >= 0; j--){
                res.add(lst.get(j));
            }
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;   
    }
}