class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> res = new HashSet<>();
        HashSet<Integer> curr = new HashSet<>();
        for(int num : arr){
            HashSet<Integer> next = new HashSet<>();
            next.add(num);
            for(int x : curr){
                next.add(x | num);
            }
            curr = next;
            res.addAll(curr);
        }
        return res.size();
    }
}