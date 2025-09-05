// FanTest.java
public class FanTest {
    public static void main(String[] args) {
        // Fan using default constructor
        Fan fan1 = new Fan();

        // Fan using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        // Display both fans
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());

        // Show functionality by modifying fields
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setColor("red");
        fan1.setRadius(8);

        System.out.println("\nAfter modifications:");
        System.out.println("Fan 1: " + fan1.toString());
    }
}
