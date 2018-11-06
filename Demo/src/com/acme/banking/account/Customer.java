package com.acme.banking.account;

import java.util.Objects;
import java.util.UUID;

public class Customer {

    private UUID id;
    private final String firstName;
    private final String lastName;

    public Customer(String fName, String lName) {
        Objects.requireNonNull(fName);
        Objects.requireNonNull(lName);

        this.firstName = fName;
        this.lastName = lName;

        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
