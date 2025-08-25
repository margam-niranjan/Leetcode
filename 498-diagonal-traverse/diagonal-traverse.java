class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length,n = mat[0].length;
        int res[] = new int[m*n];
        int row = 0, col=0;
        int dir = 1;
        int i = 0;
        while(i<res.length){
            res[i] = mat[row][col];
            i++;
            if(dir == 1){
                if(col == n-1){
                    row++;
                    dir = -1;
                }
                else if(row == 0){
                    col++;
                    dir = -1;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{
                if(row == m-1){
                    col++;
                    dir = 1;
                }
                else if(col == 0){
                    row++;
                    dir = 1;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return res;
    }
}