import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        // Create an ArrayList with at least 10 strings
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");
        words.add("JavaScript");
        words.add("Ruby");
        words.add("Swift");
        words.add("Go");
        words.add("Kotlin");
        words.add("PHP");
        words.add("Rust");

        // Print the ArrayList using a for-each loop
        System.out.println("Here are the elements in the ArrayList:");
        for (String word : words) {
            System.out.println(word);
        }

        // Ask user for an index
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index (0–" + (words.size() - 1) + ") of the element you want to see again: ");
        
        // Autoboxing/Unboxing occurs here (int <-> Integer)
        Integer index = scanner.nextInt();  

        try {
            // Auto-unboxing happens when retrieving element
            String chosenWord = words.get(index);  
            System.out.println("You chose: " + chosenWord);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        scanner.close();
    }
}
