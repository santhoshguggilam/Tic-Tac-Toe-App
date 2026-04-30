import java.util.Random;

public class TicTacToe {

    static char[] board = {
        ' ', ' ', ' ',
        ' ', ' ', ' ',
        ' ', ' ', ' '
    };

    public static void computerMove() {
        Random random = new Random();
        int position;

        // Loop until a valid move is found
        while (true) {
            // Generate random number between 1 and 9
            position = random.nextInt(9) + 1;

            // Check if the move is valid
            if (isValidMove(position)) {
                break;
            }
        }

        // Place the computer's move
        board[position - 1] = 'O'; // Computer uses 'O'
        System.out.println("Computer placed at position: " + position);
    }

    // Reusable validation method
    public static boolean isValidMove(int position) {
        return board[position - 1] == ' ';
    }

    // Helper to print board (optional)
    public static void printBoard() {
        for (int i = 0; i < 9; i++) {
            System.out.print(board[i]);
            if ((i + 1) % 3 == 0) {
                System.out.println();
            } else {
                System.out.print(" | ");
            }
        }
    }

    public static void main(String[] args) {
        printBoard();
        computerMove();
        printBoard();
    }
}