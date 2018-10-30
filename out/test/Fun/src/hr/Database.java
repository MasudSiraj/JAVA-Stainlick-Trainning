package hr;

import java.util.*;

import static java.util.Arrays.asList;

public class Database {

    private static Map<Integer, Employee> employees;

    public static Employee findById(Integer id) {
        return employees.get(id);
    }

    static {
        employees = new HashMap();
        employees.put(42, new HourlyEmployee(42, "Scott"));
        employees.put(43, new HourlyEmployee(43, "Bob"));
        employees.put(44, new HourlyEmployee(44, "Tom"));
        employees.put(45, new HourlyEmployee(45, "Julie"));
        employees.put(46, new HourlyEmployee(46, "Jill"));
        employees.put(47, new HourlyEmployee(47, "Jennie"));
        employees.put(48, new HourlyEmployee(48, "Kate"));
    }
}
