class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int max = 0;
        for(int i = 0 ; i<n ; i++){
            int j = i -1;
            while(j >= 0 && heights[j] >= heights[i])
                j = left[j];
            left[i] = j;
        }
        for(int i = n-1 ; i>=0 ; i--){
            int j = i + 1;
            while(j < n && heights[j] >= heights[i])
                j = right[j];
            right[i] = j;
        }
        for(int i = 0 ; i<n; i++){
            int width = right[i] - left[i] - 1;
            int a = heights[i] * width;
            max = Math.max(max,a);
        }
        return max;

    }
}