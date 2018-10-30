package hr;

public class Payroll {

    public static void main(String[] args) {
        Employee e1 = new HourlyEmployee(42, "Scott");
        Employee e2 = Database.findById(42);


        print(e1.equals(e2));
        print(e1.equals(e2));



    }

    private static void print(Object o){
        System.out.println(o);
    }



}
