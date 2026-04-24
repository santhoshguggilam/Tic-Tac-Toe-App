import java.util.Scanner;

// Class to convert slot number into row and column index
class SlotConverter {

    // Method to convert slot (1-9) to row and column
    public static int[] convertSlotToIndex(int slot) {

        // Convert to zero-based index
        int adjustedSlot = slot - 1;

        int row = adjustedSlot / 3;
        int col = adjustedSlot % 3;

        return new int[]{row, col};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take slot input from user
        System.out.print("Enter slot number (1 to 9): ");
        int slot = input.nextInt();

        // Validate input
        if (slot < 1 || slot > 9) {
            System.out.println("Invalid slot number. Please enter between 1 and 9.");
        } 
        else {

            // Convert slot to row and column
            int[] position = convertSlotToIndex(slot);

            // Display result
            System.out.println("Row: " + position[0]);
            System.out.println("Column: " + position[1]);
        }
    }
}