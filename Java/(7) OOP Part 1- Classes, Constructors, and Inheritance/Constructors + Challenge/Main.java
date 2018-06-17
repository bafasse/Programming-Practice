import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account("55555", 0.00, "Bob Brown", "bob_brown@gmail.com", "555-555-5555");
        Account timsAccount = new Account("Tim", "tim@gmail.com", "12345");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getCustomerEmail());
        System.out.println(bobsAccount.getCustomerPhoneNumber());
        bobsAccount.withdraw(500);
        bobsAccount.deposit(5000);
        bobsAccount.withdraw(500);

        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        System.out.println("");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 2500);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 3000, "tim@gmail.com");
        System.out.println(person3.getName());



        //==============
        // Original Code
        // =============
        // Bank customer = new Bank();

        // System.out.println("You have $" + customer.getDeposit() + " in your account");
        // System.out.println("Withdrawing $500");
        // customer.setWithdraw(500);
        // System.out.println("Depositing $500");
        // customer.setDeposit(500);
        // System.out.println("You have $" + customer.getWithdraw() + " in your account");

        // ================
        // Work in progress
        // ================
        // while (input != "quit") {
        //     Scanner input = new Scanner(System.in);
        //     System.out.println("Press 1) to deposit or 2) to withdraw or quit: ");
        //     int n = input.nextInt();
        //     if (input == 1) {
        //         System.out.println("Please enter the amount you would like to deposit: ");
        //         Scanner amount = new Scanner(System.in);
        //     }
        // }
    }
}