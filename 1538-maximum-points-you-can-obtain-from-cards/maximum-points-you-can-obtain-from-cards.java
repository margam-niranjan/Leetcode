class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum  = 0,rsum = 0,n=cardPoints.length;
        for(int i = 0 ; i<k;i++) lsum+=cardPoints[i];
        int max = lsum;
        for(int i = 0 ; i<k;i++) {
            lsum -= cardPoints[k-1-i];
            rsum += cardPoints[n-1-i];
            max = Math.max(max,lsum+rsum);
        }
        return max;
    }
}