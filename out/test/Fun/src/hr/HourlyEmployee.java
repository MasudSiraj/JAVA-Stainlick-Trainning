package hr;

public class HourlyEmployee extends Employee {


    public HourlyEmployee(Integer id, String name) {
        super(id, name);
    }

    @Override
    public double calculatePay(int hoursWorked,double hourlyRate) {
        return hoursWorked*hourlyRate;
    }

}
