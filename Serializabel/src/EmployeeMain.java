import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMain {
    public static void main(String args[]) throws IOException {
        Employee employee = new Employee();
        employee.name = "Arshdeep";
        employee.address = "Toronto";
        employee.number = 9845544;
        employee.ssn = 22231;

        FileOutputStream outputStream = new FileOutputStream("employee.txt");
        ObjectOutputStream stream = new ObjectOutputStream(outputStream);
        stream.writeObject(employee);
    }
}
