import java.util.ArrayList;
import java.util.Scanner;

public class SylvesterArrayListTest {

    // Method to return the maximum integer in the ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0; // return 0 if empty
        }

        Integer maxVal = list.get(0);
        for (Integer num : list) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            int input = scanner.nextInt();
            numbers.add(input); // add the number to the list
            if (input == 0) {
                break; // stop when 0 is entered
            }
        }

        // Call the max method
        Integer largest = max(numbers);

        // Display the result
        System.out.println("The largest value in the ArrayList is: " + largest);

        scanner.close();
    }
}
