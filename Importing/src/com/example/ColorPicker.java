package com.example;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import javax.swing.*;


public class ColorPicker extends JButton{

  /**
   *Constructor builds the button, adds the action listener to the button.
   *Action is to create an instance of the JColorChooser and do dialog.
   *Once color is selected, background is turned to new color.
   **/
  public ColorPicker() {
    setText("Show ColorPicker");
    addActionListener((e) ->{
      setBackground(JColorChooser.showDialog(((Component)e.getSource()).getParent(),
                                                 "Color Selector", Color.blue));
    });
  }

  /**
   *Invoked when this class is called form command line.
   **/
  public static void main(String[] args) {
    //Create the main window for application
    JFrame mainWindow = new JFrame();


    mainWindow.setTitle(LocalDate.now().toString());


    mainWindow.setSize(200,100);
    mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Create the color selector button and add to main window.
    ColorPicker cp = new ColorPicker();
    mainWindow.getContentPane().add(cp);

    //Set the main window in middle of screen
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension m = mainWindow.getSize();
    d.width -= m.width;
    d.height -= m.height;
    d.width /= 2;
    d.height /= 2;
    mainWindow.setLocation(d.width, d.height);
    mainWindow.setVisible(true);

  }
}
