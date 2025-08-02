class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int n = basket1.length;
        int globalMin = Integer.MAX_VALUE;
        for(int i = 0 ; i<n ; i++){
            freq.put(basket1[i], freq.getOrDefault(basket1[i], 0) + 1);
            freq.put(basket2[i], freq.getOrDefault(basket2[i], 0) - 1);
            globalMin = Math.min(globalMin, Math.min(basket1[i], basket2[i]));
        }
        List<Integer> swapList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            if (count % 2 != 0) return -1;

            int half = Math.abs(count) / 2;
            for (int i = 0; i < half; i++) {
                swapList.add(entry.getKey());
            }
        }
        Collections.sort(swapList);
        long cost = 0;
        for (int i = 0; i < swapList.size() / 2; i++) {
            cost += Math.min(swapList.get(i), 2 * globalMin);
        }

        return cost;
    }
}