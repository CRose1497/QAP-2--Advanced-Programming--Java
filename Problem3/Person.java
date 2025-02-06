package Problem3;

// Person class to store name and address details.
public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    // Constructor to initialize the person's details.
    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // toString method to display the person's full details.
    @Override
    public String toString() {
        return lastName + " " + firstName + ", " + address;
    }
}
