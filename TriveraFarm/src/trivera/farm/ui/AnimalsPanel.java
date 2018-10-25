package trivera.farm.ui;

import trivera.farm.animal.Animal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;
import java.util.stream.Collectors;

public class AnimalsPanel{
    private JPanel contents;
    private JTable animalsView;

    JPanel getContentsPanel(){
        return contents;
    }

    public void init(Collection<Animal> animals) {
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Animal");
        model.addColumn("Type");
        model.addColumn("Status");
        model.addColumn("Last Behavior Attempted");

        for (Animal animal : animals) {
            String[] row = {animal.getName(), animal.getAnimalType(), animal.getState().toString(), animal.getLastBehavior()};
            model.addRow(row);
        }

        animalsView.setModel(model);
    }

    private Vector newVector(String status) {
        Vector v = new Vector();
        v.add(status);
        return v;
    }

    public static void main(String[] args) {
        new AnimalsPanel();
    }
}
