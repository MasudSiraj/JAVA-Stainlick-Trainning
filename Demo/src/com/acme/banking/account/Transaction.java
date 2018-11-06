package com.acme.banking.account;

import java.time.LocalDateTime;

public class Transaction {
    private LocalDateTime stamp = LocalDateTime.now();
    private String description;

    public Transaction(String description){
        this.description=description;
    }

    @Override
    public String toString() {
        return stamp.toString() + " " + description;
    }
}
