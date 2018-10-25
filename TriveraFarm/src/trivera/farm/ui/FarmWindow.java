package trivera.farm.ui;

import trivera.farm.app.FarmManager;

import javax.swing.*;
import java.awt.*;

public class FarmWindow extends JFrame {

    private OverviewPanel overviewPanel;
    private AnimalsPanel animalsPanel;
    private CommandPanel commandPanel;


    public FarmWindow(FarmManager manager, String title) {
        setTitle(title);
        init(manager);
    }
    private void init(FarmManager manager){
        overviewPanel = new OverviewPanel();
        animalsPanel = new AnimalsPanel();
        commandPanel = new CommandPanel(manager);

        getContentPane().add(overviewPanel.getContentsPanel(),BorderLayout.NORTH);
        getContentPane().add(animalsPanel.getContentsPanel(),BorderLayout.CENTER);
        getContentPane().add(commandPanel.getContentsPanel(),BorderLayout.SOUTH);

        setSize(800,400);
        setLocationByPlatform(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public OverviewPanel getOverviewPanel(){
        return overviewPanel;
    }
    public AnimalsPanel getAnimalsPanel(){
        return animalsPanel;
    }



}
