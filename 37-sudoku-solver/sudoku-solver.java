class Solution {
    private boolean[][] rows = new boolean[9][9];
    private boolean[][] cols = new boolean[9][9];
    private boolean[][] boxes = new boolean[9][9];

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    rows[i][num] = true;
                    cols[j][num] = true;
                    boxes[boxIndex(i, j)][num] = true;
                }
            }
        }
        solve(board, 0, 0);
    }
    private boolean solve(char[][] board, int row, int col) {
        if (row == 9) return true;
        if (col == 9) return solve(board, row + 1, 0);
        if (board[row][col] != '.') return solve(board, row, col + 1);
        for (int num = 0; num < 9; num++) {
            if (!rows[row][num] && !cols[col][num] && !boxes[boxIndex(row, col)][num]) {
                board[row][col] = (char)(num + '1');
                rows[row][num] = cols[col][num] = boxes[boxIndex(row, col)][num] = true;
                if (solve(board, row, col + 1)) return true;
                board[row][col] = '.';
                rows[row][num] = cols[col][num] = boxes[boxIndex(row, col)][num] = false;
            }
        }
        return false;
    }
    private int boxIndex(int row, int col) {
        return (row / 3) * 3 + col / 3;
    }
}