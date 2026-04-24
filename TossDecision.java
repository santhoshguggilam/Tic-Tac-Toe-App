import java.util.Random;

// Class to decide first player and assign symbols
class TossDecision {

    public static void main(String[] args) {

        Random random = new Random();

        // Players
        String player = "Human";
        String computer = "Computer";

        // Symbols
        char humanSymbol;
        char computerSymbol;

        // Toss (0 or 1)
        int toss = random.nextInt(2);

        String currentPlayer;

        // Decide who starts and assign symbols
        if (toss == 0) {
            currentPlayer = player;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } 
        else {
            currentPlayer = computer;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }

        // Display results
        System.out.println("Toss Result: " + currentPlayer + " starts first.");

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}