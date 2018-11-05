package com.triveratech.junit.groceries;

import java.util.HashMap;
import java.util.Map;

public class PricingRules {

    private static Map<String, Integer> pricingRules = new HashMap<>();
    private static PricingRules instance = new PricingRules();

    private PricingRules(){}

    static {
        pricingRules.put("SIX_PACK_PRICE", 350);
        pricingRules.put("SIX_PACK_DEPOSIT", 30);
    }

    public static Map<String, Integer> getRules(){
        return pricingRules;
    }


}
