public class SalesEmployee extends Employee {

    private double baseSalary;
    private double sales;

    public SalesEmployee(double baseSalary, double sales) {
        this.baseSalary = baseSalary;
        this.sales = sales;
    }

    @Override
    public double calculateCompensation() {
        return baseSalary + sales*PayrollRules.COMMISION_RATE_FOR_SALES_CALCULATION;
    }

}
