public static boolean checkWin(char[] board, char player) {

    // Check all rows
    for (int i = 0; i < 9; i += 3) {
        if (board[i] == player &&
            board[i + 1] == player &&
            board[i + 2] == player) {
            return true;
        }
    }

    // Check all columns
    for (int i = 0; i < 3; i++) {
        if (board[i] == player &&
            board[i + 3] == player &&
            board[i + 6] == player) {
            return true;
        }
    }

    // Check diagonals
    if ((board[0] == player && board[4] == player && board[8] == player) ||
        (board[2] == player && board[4] == player && board[6] == player)) {
        return true;
    }

    return false;
}