class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = Integer.MIN_VALUE, maxArea = 0;
        for(int i = 0 ; i<dimensions.length; i++){
            int x = dimensions[i][0];
            int y = dimensions[i][1];
            int curr = x*x + y*y;
            if(curr > max || (curr == max && x * y > maxArea)){
                max = curr;
                maxArea = x*y;
            }

        }
        return maxArea;
        
    }
}