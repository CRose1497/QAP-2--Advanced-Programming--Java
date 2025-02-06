package Problem3;

// CreditCard class to manage credit card details and transactions.
public class CreditCard {
    private Person owner;       // The card owner.
    private Money balance;      // The current balance.
    private Money creditLimit;  // The credit limit.

    // Constructor to initialize the credit card with owner and limit.
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit); // Use copy constructor.
        this.balance = new Money(0); // Initialize balance to zero.
    }

    // Accessor method to get the balance (returns a copy).
    public Money getBalance() {
        return new Money(balance);
    }

    // Accessor method to get the credit limit (returns a copy).
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Accessor method to get owner details.
    public String getPersonals() {
        return owner.toString();
    }

    // Method to charge an amount to the credit card.
    public void charge(Money amount) {
        if (balance.getAmount() + amount.getAmount() > creditLimit.getAmount()) {
            System.out.println("Exceeds credit limit");
        } else {
            balance = new Money(balance.getAmount() + amount.getAmount());
            System.out.println("Charge: " + amount);
        }
    }

    // Method to make a payment on the credit card.
    public void payment(Money amount) {
        balance = new Money(balance.getAmount() - amount.getAmount());
        System.out.println("Payment: " + amount);
    }
}
