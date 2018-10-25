package trivera.farm.ui;

import trivera.farm.animal.Animal;
import trivera.farm.app.FarmManager;

import javax.swing.*;

public class CommandPanel {
    private JPanel buttons;

    private JButton sleepButton;
    private JButton wakeButton;
    private JButton eatButton;
    private JButton performButton;
    private JButton rewardButton;
    private JButton plus15Button;
    private JButton plus30Button;
    private JButton plus60Button;
    private JButton exitButton;

    private JPanel commandPanel;
    private FarmManager farmManager;

    CommandPanel(FarmManager manager){
        this.farmManager=manager;

        sleepButton.addActionListener(e -> handleSleep());
        wakeButton.addActionListener(e -> handleWake());
        eatButton.addActionListener(e -> handleEat());
        performButton.addActionListener(e -> handlePerform());
        rewardButton.addActionListener(e -> handleReward());
        plus15Button.addActionListener(e -> farmManager.getClock().increment(15));
        plus30Button.addActionListener(e -> farmManager.getClock().increment(30));
        plus60Button.addActionListener(e -> farmManager.getClock().increment(60));
        exitButton.addActionListener(e -> System.exit(0));

    }

    public JPanel getContentsPanel(){
        return commandPanel;
    }

    void handleSleep(){
        Animal theAnimal = getAnimal("Which Animal?");
        if (theAnimal!=null) {
            theAnimal.sleep();
            farmManager.refreshUI();
        }
    }
    void handleWake(){
        Animal theAnimal = getAnimal("Which Animal?");
        if (theAnimal!=null) {
            theAnimal.wake();
            farmManager.refreshUI();
        }
    }
    void handleEat(){
        Animal theAnimal = getAnimal("Which Animal?");
        if (theAnimal!=null) {
            theAnimal.eat();
            farmManager.refreshUI();
        }
    }

    void handlePerform(){
        Animal theAnimal = getAnimal("Which Animal?");
        String theBehavior = getBehavior("Which behavior?");
        if (theBehavior!=null) {
            theAnimal.perform(theBehavior);
            theAnimal.setLastBehavior(theBehavior);
            farmManager.refreshUI();
        }
    }

    void handleReward(){

    }

    Animal getAnimal(String promptText){
        String input = JOptionPane.showInputDialog("What animal would you like to choose?", promptText);

        if (input==null)//pressed cancel
            return null;

        Animal theAnimal = farmManager.getLivestock().get(input);
        return (theAnimal!=null) ? theAnimal : getAnimal(input + " Not found");
    }

    String getBehavior(String promptText){
        String input = JOptionPane.showInputDialog("What behavior would you like performed?", promptText);

        if (input==null)//pressed cancel
            return null;

        return (input.trim().length()>0) ? input : getBehavior(input + " Not Specified");
    }
}
