package trivera.core.employee;


public class Employee extends Person {
    private int empID;

    public Employee() {
    }

    public Employee(String name, int empID) {
        super(name);
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }


    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public double calcSalary() {
        return 0.0;
    }

    public String toString() {
        return super.toString() + " - empID: " + empID;
    }

}
