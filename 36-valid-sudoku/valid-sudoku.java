class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i<9 ; i++){
           boolean[] r = new boolean[10];
           boolean[] c = new boolean[10];
           for(int j = 0; j<9; j++){
                if(board[i][j] != '.'){
                    if(r[board[i][j] - '0']) return false;
                    r[board[i][j] - '0'] = true;
                }
                if(board[j][i] != '.'){
                    if(c[board[j][i] - '0']) return false;
                    c[board[j][i] - '0'] = true;
                }
                if(i<7 && j<7 && i%3 == 0 && j%3 == 0){
                    boolean box[] = new boolean[10];
                    for(int k = i ; k<i+3; k++){
                        for(int l = j ; l<j+3; l++){
                            if(board[k][l] != '.'){
                                if(box[board[k][l] - '0']) return false;
                                box[board[k][l] - '0'] = true;
                            }
                        }
                    }
                }
           }
        }
        return true;
    }
}