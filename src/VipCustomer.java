package src;

public class VipCustomer {
    public String name;
    public String Email;
    public double CreditLimit;

    public VipCustomer() {
        this("Clinton", "@gmail.com", 25);
    }

    public VipCustomer(String name, String email) {
        this(name, email, 12.5);
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        Email = email;
        CreditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }
}
