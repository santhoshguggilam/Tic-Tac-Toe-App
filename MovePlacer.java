import java.util.Scanner;

// Class to place move on Tic-Tac-Toe board
class MovePlacer {

    // Method to place symbol on board
    public static void placeMove(char[][] board, int row, int col, char symbol) {

        board[row][col] = symbol;
    }

    // Method to display board
    public static void displayBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initialize board
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        // Take input for move
        System.out.print("Enter row (0-2): ");
        int row = input.nextInt();

        System.out.print("Enter column (0-2): ");
        int col = input.nextInt();

        System.out.print("Enter symbol (X/O): ");
        char symbol = input.next().charAt(0);

        // Place move on board
        placeMove(board, row, col, symbol);

        // Display updated board
        System.out.println("\nUpdated Board:");
        displayBoard(board);
    }
}