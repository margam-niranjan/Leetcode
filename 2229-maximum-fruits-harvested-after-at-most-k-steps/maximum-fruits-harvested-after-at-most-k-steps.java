class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int maxFruits = 0;
        int total = 0;

        int left = 0;

        for (int right = 0; right < n; right++) {
            total += fruits[right][1];

            while (left <= right && !canReach(fruits[left][0], fruits[right][0], startPos, k)) {
                total -= fruits[left][1];
                left++;
            }

            maxFruits = Math.max(maxFruits, total);
        }

        return maxFruits;
    }

    private boolean canReach(int leftPos, int rightPos, int startPos, int k) {
        int dist = Math.min(
            Math.abs(startPos - leftPos) + (rightPos - leftPos),
            Math.abs(startPos - rightPos) + (rightPos - leftPos)
        );
        return dist <= k;
    }
}
