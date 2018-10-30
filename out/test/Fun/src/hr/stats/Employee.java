package hr.stats;



public class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public  String  whatIsYourName(){
        return name;
    }
    public  int  whatIsYourAge(){
        return age;
    }
}
