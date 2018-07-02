import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public String address;
    public int ssn;
    public int number;

    public void mailcheque() {
        System.out.print("Mailing cheque to "+name +  " " + address  + " "+ ssn + " " + number);
    }
}
