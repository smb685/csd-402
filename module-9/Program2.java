import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random rand = new Random();

        try {
            // FileWriter in append mode
            FileWriter writer = new FileWriter(file, true);

            // Write 10 random numbers separated by space
            for (int i = 0; i < 10; i++) {
                int num = rand.nextInt(100); // random 0–99
                writer.write(num + " ");
            }
            writer.write("\n"); // new line for readability
            writer.close();
            System.out.println("10 random numbers written/appended to data.file.");

            // Now read the file and display contents
            Scanner reader = new Scanner(file);
            System.out.println("\nContents of data.file:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
