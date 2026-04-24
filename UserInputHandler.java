import java.util.Scanner;

// Class to handle user input for Tic-Tac-Toe slot selection
class UserInputHandler {

    // Method to get slot input from user
    public static int getUserSlotInput() {

        Scanner input = new Scanner(System.in);
        int slot;

        // Loop until valid input is given
        while (true) {

            System.out.print("Enter slot number (1 to 9): ");
            slot = input.nextInt();

            // Validate input
            if (slot >= 1 && slot <= 9) {
                break;
            } 
            else {
                System.out.println("Invalid input. Please enter a number between 1 and 9.");
            }
        }

        return slot;
    }

    public static void main(String[] args) {

        // Get slot from user
        int userSlot = getUserSlotInput();

        // Display selected slot
        System.out.println("User selected slot: " + userSlot);
    }
}