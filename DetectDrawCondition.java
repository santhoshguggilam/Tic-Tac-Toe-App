public class DetectDrawCondition {

    // Reuse win-check method (from UC9)
    public static boolean hasWon(char[][] board, char player) {
        int size = board.length;

        // Check rows and columns
        for (int i = 0; i < size; i++) {
            boolean rowWin = true;
            boolean colWin = true;

            for (int j = 0; j < size; j++) {
                if (board[i][j] != player) rowWin = false;
                if (board[j][i] != player) colWin = false;
            }

            if (rowWin || colWin) return true;
        }

        // Check diagonals
        boolean diag1 = true, diag2 = true;
        for (int i = 0; i < size; i++) {
            if (board[i][i] != player) diag1 = false;
            if (board[i][size - 1 - i] != player) diag2 = false;
        }

        return diag1 || diag2;
    }

    // Method to detect draw
    public static boolean isDraw(char[][] board) {
        int size = board.length;
        boolean hasEmptyCell = false;

        // Traverse the board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                // Counting logic: check for empty cell
                if (board[i][j] == '-') {  // assume '-' means empty
                    hasEmptyCell = true;
                    break;
                }
            }
            if (hasEmptyCell) break;
        }

        // If no empty cells and no winner → draw
        return !hasEmptyCell &&
               !hasWon(board, 'X') &&
               !hasWon(board, 'O');
    }

    // Example usage
    public static void main(String[] args) {
        char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
        };

        if (isDraw(board)) {
            System.out.println("Game is a draw!");
        } else {
            System.out.println("Game is still in progress or someone won.");
        }
    }
}