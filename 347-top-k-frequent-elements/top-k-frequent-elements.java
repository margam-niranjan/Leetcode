class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hmm = new HashMap<>();
        int[] res = new int[k];
        for(int i = 0 ; i < nums.length; i++){
            hmm.put(nums[i], hmm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> hmm.get(a) - hmm.get(b));
        for(int i : hmm.keySet()){
            q.offer(i);
            if(q.size()>k) q.poll();
        }
        for(int i = 0 ; i<k ; i++){
            res[i] = q.poll();
        }
        return res;

    }
}