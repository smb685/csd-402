// Fan.java
public class Fan {
    // Constants
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Attributes
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Constructors
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "white";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters (using `this`)
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to display a single Fan instance (without toString)
    public void displayFan() {
        System.out.println("Fan Details: ");
        System.out.println("  Speed: " + this.speed);
        System.out.println("  On: " + this.on);
        System.out.println("  Radius: " + this.radius);
        System.out.println("  Color: " + this.color);
        System.out.println("----------------------------");
    }

    // Static method to display a collection of Fans
    public static void displayFans(java.util.Collection<Fan> fans) {
        System.out.println("Displaying all Fans in the collection:");
        for (Fan f : fans) {
            f.displayFan(); // calls the single-fan display method
        }
    }
}
