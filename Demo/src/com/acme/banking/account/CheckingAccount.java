package com.acme.banking.account;

import com.acme.banking.rules.RuleKeys;
import com.acme.banking.rules.Rules;

public class CheckingAccount extends Account{

    public CheckingAccount(Customer customer, double initialDeposit) {
        super(customer, initialDeposit);
        if( initialDeposit < minDeposit()){
            throw new IllegalArgumentException("Minimum " + minDeposit() + " deposit required");
        }

    }

    private Double minDeposit() {
        return Rules.get(RuleKeys.MINIMUM_CHECKING_DEPOSIT);
    }

}
