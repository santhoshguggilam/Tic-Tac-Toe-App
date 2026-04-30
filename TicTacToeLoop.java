import java.util.Scanner;

public class TicTacToeLoop {

    static char[] board = {
        ' ', ' ', ' ',
        ' ', ' ', ' ',
        ' ', ' ', ' '
    };

    static char currentPlayer = 'X'; // Player starts

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        while (gameRunning) {
            printBoard();

            if (currentPlayer == 'X') {
                // Player move
                System.out.print("Enter position (1-9): ");
                int position = scanner.nextInt();

                if (isValidMove(position)) {
                    board[position - 1] = 'X';
                } else {
                    System.out.println("Invalid move. Try again.");
                    continue; // retry same turn
                }

            } else {
                // Computer move (reuse UC7)
                computerMove();
            }

            // Check for win
            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameRunning = false;
            }
            // Check for draw
            else if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                gameRunning = false;
            }
            // Switch turn
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }

    public static boolean isValidMove(int position) {
        return position >= 1 && position <= 9 && board[position - 1] == ' ';
    }

    public static boolean isBoardFull() {
        for (char c : board) {
            if (c == ' ') return false;
        }
        return true;
    }

    public static void computerMove() {
        int position;
        do {
            position = (int)(Math.random() * 9) + 1;
        } while (!isValidMove(position));

        board[position - 1] = 'O';
        System.out.println("Computer chose: " + position);
    }

    public static boolean checkWin() {
        int[][] winPatterns = {
            {0,1,2},{3,4,5},{6,7,8}, // rows
            {0,3,6},{1,4,7},{2,5,8}, // cols
            {0,4,8},{2,4,6}          // diagonals
        };

        for (int[] pattern : winPatterns) {
            if (board[pattern[0]] == currentPlayer &&
                board[pattern[1]] == currentPlayer &&
                board[pattern[2]] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    public static void printBoard() {
        for (int i = 0; i < 9; i++) {
            System.out.print(board[i]);
            if ((i + 1) % 3 == 0) {
                System.out.println();
            } else {
                System.out.print(" | ");
            }
        }
        System.out.println();
    }
}