// Abstract superclass
public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Constructor requires both fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be implemented in subclasses
    public abstract void display();
}
