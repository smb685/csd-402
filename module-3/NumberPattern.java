public class NumberPattern {
    public static void main(String[] args) {
        int rows = 7; // total number of rows

        for (int i = 0; i < rows; i++) {
            // Print leading spaces to align pattern
            for (int s = rows - i; s > 1; s--) {
                System.out.print("  ");
            }

            // Print increasing powers of 2
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2; // next power of 2
            }

            // Print decreasing powers of 2
            value /= 4; // start from one step before the last printed power
            for (int j = 0; j < i; j++) {
                System.out.print(value + " ");
                value /= 2;
            }

            // Print the @ symbol at the end of the row
            System.out.println("@");
        }
    }
}
