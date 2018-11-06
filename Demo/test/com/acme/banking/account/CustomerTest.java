package com.acme.banking.account;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


public class CustomerTest {

    @Test
    public void create_a_valid_customer(){
        Customer customer = new Customer("Scott", "Stanlick");
        assertNotNull(customer.getId());
        assertEquals("Scott", customer.getFirstName());
    }

}
