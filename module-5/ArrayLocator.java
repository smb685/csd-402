public class ArrayLocator {

    // ---------- Locate Largest ----------
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};  // row, col
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};  // row, col
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // ---------- Locate Smallest ----------
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};  // row, col
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};  // row, col
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // ---------- Test Program ----------
    public static void main(String[] args) {
        double[][] doubleArray = {
            {3.2, 5.6, 1.1},
            {9.8, 2.4, 7.7},
            {0.5, 8.9, 6.3}
        };

        int[][] intArray = {
            {3, 5, 1},
            {9, 2, 7},
            {0, 8, 6}
        };

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("Largest in double array at: (" + largestDouble[0] + ", " + largestDouble[1] + ")");
        System.out.println("Smallest in double array at: (" + smallestDouble[0] + ", " + smallestDouble[1] + ")");

        System.out.println("Largest in int array at: (" + largestInt[0] + ", " + largestInt[1] + ")");
        System.out.println("Smallest in int array at: (" + smallestInt[0] + ", " + smallestInt[1] + ")");
    }
}
