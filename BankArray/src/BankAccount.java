import java.util.Scanner;

public class BankAccount extends Bank {
    int accountno;
    String ownername;
    double balance;
    static int num = 0;

    BankAccount[] bankAccount = new BankAccount[2];
    Scanner scanner = new Scanner(System.in);

    public BankAccount() {
    }

    public BankAccount(String bankname, String bankid, int accountno, String ownername, float balance) {
        super(bankname, bankid);
        this.accountno = accountno;
        this.ownername = ownername;
        this.balance = balance;
    }

    void createAccount() {
        if (num < bankAccount.length) {

            bankAccount[num] = new BankAccount();

            System.out.print("Enter Bank Account Number : ");
            bankAccount[num].accountno = scanner.nextInt();
            //System.out.println(bankAccount[num].accountno);

            System.out.print("Enter Owner Name : ");
            bankAccount[num].ownername = scanner.next();
            //System.out.print(bankAccount[num].ownername);

            System.out.print("Enter Money : ");
            bankAccount[num].balance = scanner.nextDouble();
            //System.out.println(bankAccount[num].balance);
            num++;
        } else {
            System.out.println("Not More than 2 Accounts");
        }
    }

    int findAccount() {
        int tempacc;
        int i = 0;
        System.out.print("Enter Account Number");
        tempacc = scanner.nextInt();
        do {
            i++;
            if (bankAccount[i].accountno == tempacc)
                return i;
            else
                return -1;
        }
        while (i!=bankAccount.length);
    }
    void withdraw() {

    }
    void deposit() {
        System.out.println("Enter Amount");
        double amount = scanner.nextDouble();
        int tempaccno = findAccount();

           balance = bankAccount[tempaccno].balance + amount;
           System.out.println("Balance : "+ balance);
           }



    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return super.toString() + "Account No : " + accountno + "\n" + "Ownername : " + ownername + "\n" + "Balance : " + balance ;
    }
}
