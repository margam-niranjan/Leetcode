class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<String> board = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        for(int i = 0 ;i<n ; i++){
            char[] temp = new char[n];
            Arrays.fill(temp,'.');
            board.add(new String(temp));
        }
        nQueens(board,0,n,res);
        return res;
    }
    public void nQueens(List<String> board, int row, int n,List<List<String>> res){
        if(row==n){
            res.add(new ArrayList<>(board));
            return;
        }
        for(int i = 0 ; i<n ; i++){
            if(isSafe(board,row,i,n)){
                char[] rowArr = board.get(row).toCharArray();
                rowArr[i] = 'Q';
                board.set(row,new String(rowArr));
                nQueens(board,row+1,n,res);
                rowArr[i] = '.';
                board.set(row,new String(rowArr));
            }
        }
    }
    public boolean isSafe(List<String> board, int row, int col, int n){
        for(int i = 0 ;i<row;i++){
            if(board.get(i).charAt(col) == 'Q') return false;
        }
        
        for(int i = row-1,j=col-1; i>=0 && j>=0 ; i--,j--){
            if(board.get(i).charAt(j) == 'Q') return false;
        }
        for(int i = row-1,j=col+1; i>=0 && j<n ; i--,j++){
            if(board.get(i).charAt(j) == 'Q') return false;
        }
        return true;

    }
}