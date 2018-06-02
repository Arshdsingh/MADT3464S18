import java.util.Scanner;

public class BankAccount extends Bank {
    String accountno;
    String ownername;
    double balance;
    double amount;

    Scanner scanner = new Scanner(System.in);

    public BankAccount() {
        this.accountno="";
        this.ownername="";
        this.balance=1.1;
    }

    public BankAccount(String bankname, int bankid, String accountno, String ownername, double balance) {
        super(bankname, bankid);
        this.accountno = accountno;
        this.ownername = ownername;
        this.balance = balance;
    }
    void withdraw() {
        //System.out.println("Enter Account No : ");
        //accountno  = scanner.nextLine();
        String tempacc = getAccountno();
        if (accountno.matches(tempacc)) {
            System.out.print("Enter Withdraw Amount : ");
            amount = scanner.nextDouble();
            System.out.println(this.balance);
            if (amount > this.balance) {
                System.out.println("Insufficient Balance");
            } else {
                balance = balance - amount;
                System.out.println("Available Balance : " + balance);
            }
        }
        else
            System.out.println("Account No Not Found : ");

    }
    void deposit() {
        System.out.print("Enter Deposit Amount : ");
        amount = scanner.nextDouble();
        balance = balance + amount;
        System.out.println("Balance : "+balance);
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno() {
        System.out.print("Enter Account no : ");
        this.accountno = scanner.nextLine();
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername() {
        System.out.print("Enter Name : ");
        this.ownername = scanner.nextLine();
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance() {
        System.out.print("Enter Money : ");
        this.balance = scanner.nextDouble();
        System.out.println("Set Balance"+this.balance);

    }

    @Override
    public String toString() {
        return super.toString()+ "Account No : " + accountno + "\n" + "Owner Name : " + ownername + "\n" + " Balance : " + balance ;
    }
}
