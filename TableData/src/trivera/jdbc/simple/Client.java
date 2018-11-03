package trivera.jdbc.simple;

import java.util.Collection;
import java.util.Properties;

import static trivera.jdbc.simple.Connections.runSql;

public class Client {

    public static void main(String[] args) throws Exception{

        Properties properties = new Properties();
        properties.setProperty("url", "jdbc:derby://localhost:50505/Personnel");
        properties.setProperty("username", "sa");
        properties.setProperty("password", "password");

        Connections.setConfiguration(properties);

        Collection<Employee> employees = Connections.runSql("select * from employee");
        printList(employees);

        Employee employee = new Employee(42, "Scott", "Stanlick", 250_000);
        Connections.save(employee);
    }

    private static void printList(Collection<Employee> employees) {
        for (Employee e: employees) {
            System.out.println(e);
        }
    }
}
