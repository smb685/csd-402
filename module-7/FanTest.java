// FanTest.java
import java.util.ArrayList;

public class FanTest {
    public static void main(String[] args) {
        // Create a collection of Fan objects
        ArrayList<Fan> fanCollection = new ArrayList<>();

        // Add Fans
        fanCollection.add(new Fan());
        fanCollection.add(new Fan(Fan.MEDIUM, true, 7.0, "blue"));
        fanCollection.add(new Fan(Fan.FAST, true, 10.0, "red"));
        fanCollection.add(new Fan(Fan.SLOW, false, 4.5, "green"));

        // Display all fans using collection method
        Fan.displayFans(fanCollection);

        // Display one fan individually
        System.out.println("Displaying one Fan separately:");
        fanCollection.get(2).displayFan();
    }
}
