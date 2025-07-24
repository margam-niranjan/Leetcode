class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hmm = new HashMap<>();
        int[] res = new int[k];
        for(int i : nums){
            hmm.put(i,hmm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> p = new PriorityQueue<>((a,b) -> hmm.get(a) - hmm.get(b));
        for(int i : hmm.keySet()){
            p.offer(i);
            if(p.size()>k) p.poll();
        }
        for(int i = 0 ; i<k;i++){
            res[i] = p.poll();
        }
        return res;

    }
}