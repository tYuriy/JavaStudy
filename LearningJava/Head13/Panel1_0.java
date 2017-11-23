package LearningJava.Head13;

/**
 * Created by user on 10.04.2017.
 */
import javax.swing.*;
import java.awt.*;

public class Panel1_0 {
    public static void main(String[] args) {
        Panel1_0 gui = new Panel1_0();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        JButton button = new JButton("shock me");
        JButton button2 = new JButton("bliss");
        JButton button3 = new JButton("huh?");
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        frame.getContentPane().add(BorderLayout.CENTER,panel);

        frame.setSize(250,200);frame.pack();
        frame.setVisible(true);
    }
}