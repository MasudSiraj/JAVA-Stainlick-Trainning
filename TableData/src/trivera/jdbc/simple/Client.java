package trivera.jdbc.simple;

import java.util.Collection;
import java.util.Properties;



public class Client {

    public static void main(String[] args) throws Exception{

        Properties properties = new Properties();
        properties.setProperty("url", "jdbc:derby://localhost:50505/Personnel");
        properties.setProperty("username", "sa");
        properties.setProperty("password", "password");

        Connections connections = new Connections(properties);


        Collection<Employee> employees = connections.runSql("select * from employee");
        printList(employees);

        Employee employee = new Employee(42, "Scott", "Stanlick", 250_000);
        connections.save(employee);
    }

    private static void printList(Collection<Employee> employees) {
        for (Employee e: employees) {
            System.out.println(e);
        }
    }
}
