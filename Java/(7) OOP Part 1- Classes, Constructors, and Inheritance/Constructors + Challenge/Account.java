public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
	private String customerPhoneNumber;
	
	public Account() {
		this("12345", 0.00, "defaultName", "defaultEmail", "defaultPhoneNumber");
		System.out.println("Empty Constructor called");
	}

	public Account(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
		System.out.println("Account constructor with parameters called");
		this.number               = number;
		this.balance              = balance;
		this.customerName         = customerName;
		this.customerEmail        = customerEmail;
		this.customerPhoneNumber  = customerPhoneNumber
	}

    public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("$" + depositAmount + " deposited. New balance: $" + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if (balance - withdrawAmount < 0) {
			System.out.println("Only $" + this.balance + " available. Withdrawl of $" + withdrawAmount + " denied");
		}

		else {
			this.balance -= withdrawAmount;
			System.out.println("$" + withdrawAmount + " withdrawn. Remaining balance: $" + this.balance);
		}
    }
	public String getNumber()
	{
		return this.number;
	}

	public void setNumber(String number)
	{
		this.number = number;
	}

	public double getBalance()
	{
		return this.balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public String getCustomerName()
	{
		return this.customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String getCustomerEmail()
	{
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail)
	{
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhoneNumber()
	{
		return this.customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber)
	{
		this.customerPhoneNumber = customerPhoneNumber;
	}




    // private int deposit;
    // private int withdraw;

    // public void setDeposit(int deposit) {
    //     this.deposit += deposit;
    // }

    // public int getDeposit() {
    //     return this.deposit;
    // }

    // public void setWithdraw(int withdraw) {
    //     if (this.withdraw - withdraw <= 0) {
    //         System.out.println("This transaction will result in an overdraft");
    //         this.withdraw = this.withdraw;
    //     }

    //     else {
    //         this.withdraw -= withdraw;
    //     }
    // }

    // public int getWithdraw() {
    //     return this.withdraw;
    // }
}