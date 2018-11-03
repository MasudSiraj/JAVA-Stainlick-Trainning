package trivera.jdbc.simple;

public class Employee {

    private final int id;
    private final String lName,fName;
    private final double salary;

    public Employee(int empId, String firstName, String lastName, double salary) {
        this.id=empId;
        this.fName=firstName;
        this.lName=lastName;
        this.salary=salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", lName='").append(lName).append('\'');
        sb.append(", fName='").append(fName).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getlName() {
        return lName;
    }

    public String getfName() {
        return fName;
    }

    public double getSalary() {
        return salary;
    }
}
