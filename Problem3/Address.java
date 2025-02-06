package Problem3;

// Address class to store location details.
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor to initialize the address.
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // toString method to display the address in a readable format.
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
