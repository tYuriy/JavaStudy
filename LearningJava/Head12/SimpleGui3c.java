package LearningJava.Head12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 07.04.2017.
 */
public class SimpleGui3c implements ActionListener{

        JFrame frame;
        JLabel label;
        JButton colorButton;
        JButton lblButton;

    public static void main(String[] args) {
        SimpleGui3c gui = new SimpleGui3c();
        gui.go();
    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        colorButton = new JButton("Change colors");
        lblButton = new JButton("Change label");
        label = new JLabel("smthing");
        colorButton.addActionListener(this);
        lblButton.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH,colorButton);
        frame.getContentPane().add(BorderLayout.EAST,lblButton);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.getContentPane().add(BorderLayout.WEST,label);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    public void actionPerformed (ActionEvent event){
        if (event.getSource()==colorButton){
            frame.repaint();
        } else {label.setText("painfull");}


    }
}
