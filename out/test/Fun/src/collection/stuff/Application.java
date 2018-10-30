package collection.stuff;

import javax.swing.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Application {

//  Abstract Type                         Concrete Implementation
    Map<String, String> stateLookup = new Hashtable<>();

    public static void main(String[] args) {
        new Application();
    }

    Application(){
        loadMapping();
        while(true){
            String userInput = JOptionPane.showInputDialog("(" + stateLookup.size() + ") Enter State Abbreviation");

            boolean wasItInThere = stateLookup.containsKey(userInput.toUpperCase());

            String stateName = "Your input is silly!";

            if(wasItInThere){
                stateName = stateLookup.get(userInput.toUpperCase());
            }

            JOptionPane.showMessageDialog(null, stateName);
        }
    }

    private void loadMapping() {
        stateLookup.put("TX", "Texas");
        stateLookup.put("KS", "Kansas");
        stateLookup.put("MO", "Missouri");
        stateLookup.put("AR", "Arkansas");
        stateLookup.put("OK", "Oklahoma");
        stateLookup.put("AZ", "Arizona");

    }


}
