package trivera.farm.ui;

import javax.swing.*;

public class OverviewPanel {
    private JLabel timeLabel;
    private JLabel farmerLabel;
    private JLabel farmLabel;
    private JPanel contents;

    public void init(String s, String s1, String s2) {
        timeLabel.setText(s);
        farmerLabel.setText(s1);
        farmLabel.setText(s2);
    }

    JPanel getContentsPanel(){
        return contents;
    }
}
