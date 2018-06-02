import java.util.Scanner;

public class Bank {
    String bankname;
    int bankid;

    Scanner scanner = new Scanner(System.in);

    public Bank() {
    }

    public Bank(String bankname, int bankid) {
        this.bankname = bankname;
        this.bankid = bankid;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname() {
        System.out.print("Enter Bank Name : ");
        this.bankname = scanner.nextLine();
    }

    public int getBankid() {
        return bankid;
    }

    public void setBankid() {
        System.out.print("Enter Bank Id : ");
        this.bankid = scanner.nextInt();
    }


    @Override
    public String toString() {
        return "Bankname : " + bankname +"\n" + "Bank ID= " + bankid ;
    }
}
