public class AutoService {

    // Base service charge
    private static final double STANDARD_SERVICE = 200.00;
    private static final double OIL_CHANGE_FEE = 40.00;
    private static final double TIRE_ROTATION_FEE = 30.00;

    // yearlyService with no parameters
    public static double yearlyService() {
        return STANDARD_SERVICE;
    }

    // yearlyService with one parameter (oil change fee)
    public static double yearlyService(double oilChange) {
        return STANDARD_SERVICE + oilChange;
    }

    // yearlyService with two parameters (oil change + tire rotation)
    public static double yearlyService(double oilChange, double tireRotation) {
        return STANDARD_SERVICE + oilChange + tireRotation;
    }

    // yearlyService with three parameters (oil change + tire rotation - coupon)
    public static double yearlyService(double oilChange, double tireRotation, double coupon) {
        return STANDARD_SERVICE + oilChange + tireRotation - coupon;
    }

    // Main method to test
    public static void main(String[] args) {
        // Test yearlyService with no parameters
        System.out.println("Test 1 (No parameters): $" + yearlyService());
        System.out.println("Test 2 (No parameters): $" + yearlyService());

        // Test yearlyService with one parameter
        System.out.println("Test 1 (Oil change): $" + yearlyService(OIL_CHANGE_FEE));
        System.out.println("Test 2 (Oil change): $" + yearlyService(45.00)); // different oil fee

        // Test yearlyService with two parameters
        System.out.println("Test 1 (Oil + Tire): $" + yearlyService(OIL_CHANGE_FEE, TIRE_ROTATION_FEE));
        System.out.println("Test 2 (Oil + Tire): $" + yearlyService(50.00, 25.00)); // different fees

        // Test yearlyService with three parameters
        System.out.println("Test 1 (Oil + Tire - Coupon): $" + yearlyService(OIL_CHANGE_FEE, TIRE_ROTATION_FEE, 20.00));
        System.out.println("Test 2 (Oil + Tire - Coupon): $" + yearlyService(40.00, 35.00, 15.00));
    }
}
