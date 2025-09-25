public class DomesticDivision extends Division {
    private String state;

    // Constructor requires all fields
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Implement abstract method
    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName +
                "\nAccount Number: " + accountNumber +
                "\nState: " + state + "\n");
    }
}
