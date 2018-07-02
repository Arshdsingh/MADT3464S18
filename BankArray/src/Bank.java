public class Bank {
    String Bankname;
    String Bankid;

    public Bank(String bankname, String bankid) {
        Bankname = bankname;
        Bankid = bankid;
    }

    public Bank() {
    }

    public String getBankname() {
        return Bankname;
    }

    public void setBankname(String bankname) {
        Bankname = bankname;
    }

    public String getBankid() {
        return Bankid;
    }

    public void setBankid(String bankid) {
        Bankid = bankid;
    }

    @Override
    public String toString() {
        return "Bankname : " + Bankname + "\n" + "Bankid : " + Bankid + "\n" ;
    }
}
