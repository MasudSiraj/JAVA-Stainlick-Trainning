package com.acme.banking.account;

import com.acme.banking.rules.RuleKeys;
import com.acme.banking.rules.Rules;
import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Account {


    private double balance;
    private Customer customer;
    private Collection<Transaction> transactions = new ArrayList();

    public Account(Customer customer, double initialDeposit) {
        this.customer = customer;
        balance = initialDeposit;
        createTransaction(customer);
    }

    private boolean createTransaction(Customer customer) {
        return transactions().add(new Transaction(getClass().getSimpleName() + " created for " + customer));
    }


    public double getBalance() {
        return balance;
    }

    Collection<Transaction> transactions(){
        return transactions;
    }

    public Customer getCustomer() {
        return customer;
    }
}
