public class CheckWinningCondition {

    // Method to check if a player has won
    public static boolean hasWon(char[][] board, char player) {
        int size = board.length;

        // Check all rows
        for (int i = 0; i < size; i++) {
            boolean rowWin = true;
            for (int j = 0; j < size; j++) {
                if (board[i][j] != player) {
                    rowWin = false;
                    break;
                }
            }
            if (rowWin) return true;
        }

        // Check all columns
        for (int j = 0; j < size; j++) {
            boolean colWin = true;
            for (int i = 0; i < size; i++) {
                if (board[i][j] != player) {
                    colWin = false;
                    break;
                }
            }
            if (colWin) return true;
        }

        // Check main diagonal
        boolean diag1Win = true;
        for (int i = 0; i < size; i++) {
            if (board[i][i] != player) {
                diag1Win = false;
                break;
            }
        }

        // Check secondary diagonal
        boolean diag2Win = true;
        for (int i = 0; i < size; i++) {
            if (board[i][size - 1 - i] != player) {
                diag2Win = false;
                break;
            }
        }

        return diag1Win || diag2Win;
    }

    // Example usage
    public static void main(String[] args) {
        char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'O', 'X', 'X'}
        };

        char currentPlayer = 'X';

        if (hasWon(board, currentPlayer)) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("No winner yet.");
        }
    }
}