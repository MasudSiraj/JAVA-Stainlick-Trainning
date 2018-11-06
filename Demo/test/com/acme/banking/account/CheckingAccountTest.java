package com.acme.banking.account;

import org.junit.BeforeClass;
import org.junit.Test;

public class CheckingAccountTest {

    private static Customer customer;

    @BeforeClass
    public static void oneTimeOnlyBefore(){
        customer = new Customer("Scott", "Stanlick");
    }

    @Test
    public void test_create_valid_checking_account(){
        CheckingAccount checkingAccount = new CheckingAccount(customer, 50);

    }

}
