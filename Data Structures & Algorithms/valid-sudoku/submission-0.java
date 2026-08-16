class Solution {
    public boolean isValidSudoku(char[][] board) {
        return hasValidRows(board) && hasValidColumns(board) && hasValidBoxes(board);
    }

    private boolean hasValidRows(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (!set.add(board[i][j])) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean hasValidColumns(char[][] board) {
        for (int j = 0; j < board.length; j++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < board[j].length; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (!set.add(board[i][j])) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean hasValidBoxes(char[][] board) {
        for (int k = 0; k < 9; k++) {
            int boxRow = k / 3 * 3;
            int boxCol = k % 3 * 3;
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                int row = boxRow + (i/ 3);
                int col = boxCol + (i % 3);

                if (board[row][col] == '.') {
                    continue;
                }

                if(!set.add(board[row][col])) {
                    return false;
                }
            }
        }

        return true;
        
    }
}