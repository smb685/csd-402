public class InternationalDivision extends Division {
    private String country;
    private String language;

    // Constructor requires all fields
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Implement abstract method
    @Override
    public void display() {
        System.out.println("International Division: " + divisionName +
                "\nAccount Number: " + accountNumber +
                "\nCountry: " + country +
                "\nLanguage: " + language + "\n");
    }
}
