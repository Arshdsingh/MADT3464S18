import java.util.Scanner;

public class BankMain {
    public static void main(String args[]) {
        int a = 20;
        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();
        do {

            System.out.println("1 : Create Account");
            System.out.println("2 : Deposit");
            System.out.println("3 : WithDraw");
            System.out.println("4 : Exit");

            System.out.print("Enter Choice : ");
            a = scanner.nextInt();


            switch (a) {
                case 1:
                    bankAccount.createAccount();
                    break;
                case 2:
                    bankAccount.deposit();
                    break;
                case 3:

                    break;
            }
        }
        while (a!=4);


    }
}
