public class SalariedEmployee extends Employee{

    private double annualSalary;

    public SalariedEmployee(double annualSalary){
        this.annualSalary=annualSalary;
    }

    @Override
    public double calculateCompensation() {
        return annualSalary/PayrollRules.FREQUENCY_OF_PAY_FOR_SALARIED_EMPLOYEES;
    }
}
