package com.acme.banking.account;

import com.acme.banking.rules.RuleKeys;
import com.acme.banking.rules.Rules;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class SavingsAccountTest {

    private static Customer customer;

    @BeforeClass
    public static void oneTimeOnlyBefore(){
        customer = new Customer("Scott", "Stanlick");
    }

    @Test
    public void test_with_initial_deposit(){
        SavingsAccount mySavingsAccount = new SavingsAccount(customer, 500.00);
        assertEquals(500.00, mySavingsAccount.getBalance(), 0.0);
        assertSame(customer, mySavingsAccount.getCustomer());
        assertEquals(1, mySavingsAccount.transactions().size());

    }


    @Test(expected = IllegalArgumentException.class)
    public void test_with_initial_deposit_less_than_current_rule(){
        Double currentMinimumBalanceRule = Rules.get(RuleKeys.MINIMUM_SAVINGS_DEPOSIT);
        SavingsAccount mySavingsAccount = new SavingsAccount(customer,currentMinimumBalanceRule - 1);
   }

    @Test(expected = IllegalArgumentException.class)
    public void test_with_initial_deposit_of_negative(){
        SavingsAccount mySavingsAccount = new SavingsAccount(customer,-30.00);
    }
}
