package hr.stats;

import auto.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Database {

    static Collection<Employee> getEmployeesPrettyPlease(){



        return Arrays.asList(
                new Employee("Scott", 37),
                new Employee("Tom", 12),
                new Employee("Sue", 47)
        );

    }
}
