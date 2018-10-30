package hr.stats;

import java.util.Collection;

import static hr.stats.Database.getEmployeesPrettyPlease;





public class HumanResourcesDepartment {


    void runReport(){
        for(Employee employee : getEmployeesPrettyPlease()){
            System.out.println(employee.whatIsYourName());
        }
    }



}
