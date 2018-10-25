package trivera.core.employee;

/**
 * <p>
 * This component and its source code representation are copyright protected
 * and proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and
 * evaluation purposes only. No part of this component or its source code
 * may be sold, transferred, or publicly posted, nor may it be used in a
 * commercial or production environment, without the express written consent
 * of Trivera Technologies, LLC
 *
 * Copyright (c) 2018 Trivera Technologies, LLC.
 * http://www.triveratech.com   
 * </p>
 * @author Trivera Technologies Tech Team.
 */

public class Test {

    public static void main(String[] args) {
        Person pers = null;
        Employee emp, emp2 = null;

        // Instantiate a person and an employee, using the two variables
        // supplied
        pers = new Person("Jennifer");
        emp = new Employee("Bob", 10);

        emp2 = new Employee("bob", 10);

        System.out.println("Person   : " + pers.toString());
        System.out.println("Employee : " + emp);


        System.out.println("emp.equals(emp2) " + emp.equals(emp2));
        System.out.println("emp==emp2 " + (emp==emp2));


    }

}