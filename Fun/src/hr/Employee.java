package hr;

import java.util.Objects;

public abstract class Employee {

    // Object Properties
    private Integer id;
    private String name;







    // Constructors
    public Employee(Integer id, String name) {
        this.id=id;
        this.name=name;
    }



    // abstract methods
    public abstract double calculatePay(int hoursWorked,double hourlyRate);





    // Methods
    public String getName() {return name; }


    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
