package LearningJava.Head12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 07.04.2017.
 */
public class TwoButtons {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("change label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("change circle");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("its a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH,colorButton);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.getContentPane().add(BorderLayout.EAST,labelButton);
        frame.getContentPane().add(BorderLayout.WEST,label);

        frame.setSize(500,500);
        frame.setVisible(true);
    }
    class LabelListener implements ActionListener {
        public void actionPerformed (ActionEvent event){
            if (label.getText() == "oops"){
                label.setText("yeah");
            } else {label.setText("oops");}

        }
    }
    class ColorListener implements ActionListener {
        public void actionPerformed (ActionEvent event){
            frame.repaint();
        }
    }
}
