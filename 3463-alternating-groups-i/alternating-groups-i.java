class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int sum = 0;
        int n = colors.length;
        for(int i = 0 ; i<n ; i++){
            int left = colors[i];
            int middle = colors[(i+1) % n];
            int right = colors[ (i+2) % n];
            if(left == right && left != (middle)) sum++;

        }
        return sum;
        
    }
}