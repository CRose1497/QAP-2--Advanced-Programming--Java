package Problem3;

// Money class to model monetary amounts.
public class Money {
    private double amount; // The monetary value.

    // Constructor to initialize the monetary value.
    public Money(double amount) {
        this.amount = amount;
    }

    // Copy constructor.
    public Money(Money other) {
        this.amount = other.amount;
    }

    // Getter method for the monetary amount.
    public double getAmount() {
        return amount;
    }

    // toString method to display the monetary amount in currency format.
    @Override
    public String toString() {
        return String.format("$%.2f", amount);
    }

    // equals method to compare two Money objects.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return Double.compare(money.amount, amount) == 0;
    }

    // compareTo method to compare two Money objects.
    public int compareTo(Money other) {
        return Double.compare(this.amount, other.amount);
    }
}
