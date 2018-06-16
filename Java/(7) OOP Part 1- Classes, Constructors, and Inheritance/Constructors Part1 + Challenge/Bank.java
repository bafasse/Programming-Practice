public class Bank {
    private int deposit;
    private int withdraw;

    public void setDeposit(int deposit) {
        this.deposit += deposit;
    }

    public int getDeposit() {
        return this.deposit;
    }

    public void setWithdraw(int withdraw) {
        if (this.withdraw - withdraw <= 0) {
            System.out.println("This transaction will result in an overdraft");
            this.withdraw = this.withdraw;
        }

        else {
            this.withdraw -= withdraw;
        }
    }

    public int getWithdraw() {
        return this.withdraw;
    }
}