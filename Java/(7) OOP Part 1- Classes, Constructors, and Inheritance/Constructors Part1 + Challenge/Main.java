import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank customer = new Bank();

        System.out.println("You have $" + customer.getDeposit() + " in your account");
        System.out.println("Withdrawing $500");
        customer.setWithdraw(500);
        System.out.println("Depositing $500");
        customer.setDeposit(500);
        System.out.println("You have $" + customer.getWithdraw() + " in your account");

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