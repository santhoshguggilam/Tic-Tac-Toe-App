import java.util.Scanner;

// Class to validate user move in Tic-Tac-Toe
class MoveValidator {

    // Method to check if move is valid
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check boundary conditions
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create and initialize board
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        // Take input row and column
        System.out.print("Enter row (0-2): ");
        int row = input.nextInt();

        System.out.print("Enter column (0-2): ");
        int col = input.nextInt();

        // Validate move
        if (isValidMove(board, row, col)) {
            System.out.println("Valid move. Cell is empty and within bounds.");
        } 
        else {
            System.out.println("Invalid move. Either out of bounds or cell already occupied.");
        }
    }
}