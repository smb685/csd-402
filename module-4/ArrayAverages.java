public class ArrayAverages {

    // Method for short[]
    public static short average(short[] array) {
        int sum = 0; // use int to prevent overflow
        for (short val : array) {
            sum += val;
        }
        return (short) (sum / array.length);
    }

    // Method for int[]
    public static int average(int[] array) {
        long sum = 0; // use long to prevent overflow
        for (int val : array) {
            sum += val;
        }
        return (int) (sum / array.length);
    }

    // Method for long[]
    public static long average(long[] array) {
        long sum = 0;
        for (long val : array) {
            sum += val;
        }
        return sum / array.length;
    }

    // Method for double[]
    public static double average(double[] array) {
        double sum = 0;
        for (double val : array) {
            sum += val;
        }
        return sum / array.length;
    }

    // Test program
    public static void main(String[] args) {
        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 15, 25, 35};
        long[] longArray = {1000L, 2000L, 3000L, 4000L, 5000L};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5};

        // Display arrays and averages
        displayResults(shortArray, average(shortArray));
        displayResults(intArray, average(intArray));
        displayResults(longArray, average(longArray));
        displayResults(doubleArray, average(doubleArray));
    }

    // Overloaded helper methods for displaying results

    public static void displayResults(short[] array, short avg) {
        System.out.print("short array: ");
        for (short val : array) {
            System.out.print(val + " ");
        }
        System.out.println("\nAverage: " + avg + "\n");
    }

    public static void displayResults(int[] array, int avg) {
        System.out.print("int array: ");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println("\nAverage: " + avg + "\n");
    }

    public static void displayResults(long[] array, long avg) {
        System.out.print("long array: ");
        for (long val : array) {
            System.out.print(val + " ");
        }
        System.out.println("\nAverage: " + avg + "\n");
    }

    public static void displayResults(double[] array, double avg) {
        System.out.print("double array: ");
        for (double val : array) {
            System.out.print(val + " ");
        }
        System.out.printf("\nAverage: %.2f\n\n", avg);
    }
}
