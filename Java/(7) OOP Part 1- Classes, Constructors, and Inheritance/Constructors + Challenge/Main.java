import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account("55555", 0.00, "Bob Brown", "bob_brown@gmail.com", "555-555-5555");

        // bobsAccount.setNumber("12345");
        // bobsAccount.setBalance(0.00);
        // bobsAccount.setCustomerName("Bob Brown");
        // bobsAccount.setCustomerEmail("bob_brown@gmail.com");
        // bobsAccount.setCustomerPhoneNumber("555-555-5555");
        System.out.println(bobsAccount.getNumber);
        System.out.println(bobsAccount.getBalance);
        System.out.println(bobsAccount.getCustomerName);
        System.out.println(bobsAccount.getCustomerEmail);
        System.out.println(bobsAccount.getCustomerPhoneNumber);
        bobsAccount.withdraw(500);
        bobsAccount.deposit(5000);
        bobsAccount.withdraw(500);

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