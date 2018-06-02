import java.util.Scanner;

public class BankMain {
    public static void main (String args[]) {
        BankAccount bankAccount = new BankAccount();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int a = 20;
            //BankAccount bankAccount;
            System.out.println("1 --> Create Account");
            System.out.println("2 --> Withdraw");
            System.out.println("3 --> Deposit");
            System.out.println("Select Choice : ");
            a = scanner.nextInt();

            switch (a) {
                case 1:
                    bankAccount.setOwnername();
                    bankAccount.setAccountno();
                    bankAccount.setBalance();
                    break;
                case 2:
                    bankAccount.withdraw();
                    break;
                case 3:
                    bankAccount.deposit();
                    break;

            }


        }
    }
}
