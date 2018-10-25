import java.util.Arrays;
import java.util.Collection;

public class Payroll {


    public static void main(String[] args) {
        for(Employee employee : getEmployees()){
            System.out.println(employee.calculateCompensation());
        }
    }












    private static Collection<Employee> getEmployees(){
        return Arrays.asList(
                new SalariedEmployee(60_000),
                new HourlyEmployee(1.00, 40),
                new SalesEmployee(2000, 10_000)
        );
    }


}
