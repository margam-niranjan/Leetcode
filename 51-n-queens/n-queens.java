class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        nQueens(board,0,n,result);
        return result;
    }
    void nQueens(char[][] board,int row,int n,List<List<String>> result){
        if(row == n){
            List<String> current = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                current.add(new String(board[i]));
            }
            result.add(current);
            return;
        }
        for(int i = 0 ; i<n; i++){
            if(isSafe(board,row,i,n)){
                board[row][i] = 'Q';
                nQueens(board,row+1,n,result);
                board[row][i] = '.';
            }                
        }
    }
    boolean isSafe(char[][] board,int row,int col, int n){
        for(int i = 0 ; i < n ; i++){
            if(board[i][col] == 'Q')return false;
            if(board[row][i] == 'Q')return false;
        }
        for(int i = row,j = col; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q')return false;
        }
        for(int i = row,j = col; i>=0 && j<n; i--,j++){
            if(board[i][j] == 'Q')return false;
        }
        return true;
    }
}