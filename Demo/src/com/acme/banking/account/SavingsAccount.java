package com.acme.banking.account;

import com.acme.banking.rules.RuleKeys;
import com.acme.banking.rules.Rules;

public class SavingsAccount extends Account{


    public SavingsAccount(Customer customer, double initialDeposit) {
        super(customer, initialDeposit);
        if( initialDeposit < minDeposit()){
            throw new IllegalArgumentException("Minimum " + minDeposit() + " deposit required");
        }

    }

    private Double minDeposit() {
        return Rules.get(RuleKeys.MINIMUM_SAVINGS_DEPOSIT);
    }

    public boolean doYouEnjoyBeingASavingsAccount(){
        return true;
    }
}
