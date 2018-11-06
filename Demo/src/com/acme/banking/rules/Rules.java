package com.acme.banking.rules;

import java.util.HashMap;
import java.util.Map;

public class Rules {

    private static Map<RuleKeys, Double> rules = new HashMap<>();

    private Rules(){}

    static{
        rules.put(RuleKeys.MINIMUM_SAVINGS_DEPOSIT, 250.00);
        rules.put(RuleKeys.MINIMUM_CHECKING_DEPOSIT, 50.00);
        rules.put(RuleKeys.NOMINAL_INTEREST_RATE, .025);
    }

    public static Double get(RuleKeys key){
        return rules.get(key);
    }

}
