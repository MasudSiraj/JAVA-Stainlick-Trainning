package auto;

import hr.HourlyEmployee;

import java.util.List;

public class Application {


    public static void main(String[] args) {
//      Type           obj ref name
        HourlyEmployee  h1 =                 new HourlyEmployee(42, "Scott");
        HourlyEmployee  h2 =                 new HourlyEmployee(42, "Sally");


        System.out.println(h1.equals(       new Long(42)        ));
    }
}
