public class UseDivision {
    public static void main(String[] args) {
        // Create two InternationalDivision objects
        InternationalDivision intDiv1 = new InternationalDivision("Global Sales", 1001, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("Asia-Pacific Ops", 1002, "Japan", "Japanese");

        // Create two DomesticDivision objects
        DomesticDivision domDiv1 = new DomesticDivision("East Coast Services", 2001, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast Tech", 2002, "California");

        // Display all divisions
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
