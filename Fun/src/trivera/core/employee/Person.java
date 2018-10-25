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


public class Person {
    // The name private instance field
    private String name;

    public Person() {
    }

    public Person(String name) {
        // Saves the name argument into the instance field
        this.name = name;

    }

    public boolean equals(Object other) {
        if (!(other instanceof Person))
            return false;

        Person otherPerson = (Person) other;

        String otherName = otherPerson.getName();

        return otherName != null && otherName.equalsIgnoreCase(this.name);
    }

    public String toString() {
        // return the name of the Person
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
