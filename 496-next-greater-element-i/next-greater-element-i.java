class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer, Integer> hmm = new HashMap<>();
        for(int i = nums2.length - 1 ; i >= 0 ; i--){
            while(!stk.isEmpty() && stk.peek() <= nums2[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                hmm.put(nums2[i], -1);
            }
            else{
                hmm.put(nums2[i], stk.peek());
            }
            stk.push(nums2[i]);
            
        }
        int res[] = new int[nums1.length];
        for(int i = 0 ;i<nums1.length ; i++){
            res[i] = hmm.get(nums1[i]);
        }
        return res;
    }
}