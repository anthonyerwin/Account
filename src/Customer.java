public class Customer {
    private String firstName, lastName, street, city,
            state, zip;

    /**
     * constructor
     * pre: none
     * post: A Customer object has been created.
     * Customer data has been initialized with parameters.
     */
    public Customer(String firstName, String lastName, String street,
            String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /**
     * Returns a String that represents the Customer object.
     * pre: none
     * post: A string representing the Account object has
     * been returned.
     */
    public String toString() {
        String custString;
        custString = firstName + " " + lastName + "\n";
        custString += street + "\n";
        custString += city + ", " + state + " " + zip + "\n";
        return (custString);
    }
}
