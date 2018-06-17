public class VipCustomer {
    private String name;
    private double creditLimit;
    private String customerEmail;

    public VipCustomer() {
        this("defaultName", 1000, "johndoe@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String customerEmail) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }
    
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "johndoe@gmail.com");
    }

	public String getName()
	{
		return this.name;
	}

	public double getCreditLimit()
	{
		return this.creditLimit;
	}

	public String getCustomerEmail()
	{
		return this.customerEmail;
	}
}