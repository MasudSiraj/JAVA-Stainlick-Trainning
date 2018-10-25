public class HourlyEmployee extends Employee {

    private double hourlyPayRate;
    private double hoursWorked;

    public HourlyEmployee(double hourlyPayRate, double hoursWorked) {
        this.hourlyPayRate = hourlyPayRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    //TODO This logic is incomplete
    public double calculateCompensation() {
        if (hoursWorked <= PayrollRules.STANDARD_HOURS_IN_A_WEEK)
            return hoursWorked*hourlyPayRate;

        if (PayrollRules.IS_OVERTIME_RECOGNIZED){
            double hoursOver = hoursWorked-PayrollRules.STANDARD_HOURS_IN_A_WEEK;
            double regularPay = (hoursWorked-hoursOver) * hourlyPayRate;
            double overtimePay = hoursOver * hourlyPayRate * PayrollRules.OVERTIME_RATE;
            return regularPay+overtimePay;
        }

        return hoursWorked*hourlyPayRate;
    }
}
