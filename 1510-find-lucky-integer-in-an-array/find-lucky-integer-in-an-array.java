class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hmm = new HashMap<>();
        for(int i : arr){
            hmm.put(i,hmm.getOrDefault(i,0)+1);
        }
        int res = -1;
        for(int i : hmm.keySet()){
            if(hmm.get(i) == i) res = i;
        }
        return res;
    }
}