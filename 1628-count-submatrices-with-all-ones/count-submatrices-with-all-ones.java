class Solution{
    public int numSubmat(int[][] mat) {
        generateArrayMatrix(mat);
        int sumCount = 0;
        int m = mat.length, n = mat[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int count = 0, minRow = Integer.MAX_VALUE;  
                for(int k = i; k < m; k++) {
                    if(mat[k][j] == 0)  break;
                    minRow = Math.min(minRow, mat[k][j]);
                    count += minRow;
                }
                sumCount += count;
            }
        }
        return sumCount;
    }
    public void generateArrayMatrix(int mat[][]) {
        int m = mat.length, n = mat[0].length;
        for(int i = 0; i < m; i++)
            mat[i][n-1] = mat[i][n-1] == 1 ? 1 : 0;
        for(int i = 0; i < m; i++)
            for(int j = n-2; j >= 0; j--)
                mat[i][j] = mat[i][j] == 1 ? mat[i][j+1] + 1 : 0;
        return;
    }
}