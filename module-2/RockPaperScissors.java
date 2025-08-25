import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Computer's random choice (1 = Rock, 2 = Paper, 3 = Scissors)
        int computerChoice = random.nextInt(3) + 1;

        // Prompt user for input
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice: 1 = Rock, 2 = Paper, 3 = Scissors");
        int userChoice = input.nextInt();

        // Display both choices
        System.out.println("You chose: " + choiceToString(userChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        // Determine winner
        if (userChoice == computerChoice) {
            System.out.println("It’s a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) || 
                   (userChoice == 2 && computerChoice == 1) || 
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        input.close();
    }

    // Helper method to convert numbers to readable choices
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }
}
