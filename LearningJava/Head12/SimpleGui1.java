package LearningJava.Head12;

/**
 * Created by user on 06.04.2017.
 */
import javax.swing.*;

public class SimpleGui1 {
    public static void main (String[] args){
        JFrame frame = new JFrame();
        JButton button = new JButton("go to the banya");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(600,600);

        frame.setVisible(true);

    }

}
