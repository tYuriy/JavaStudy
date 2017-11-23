package LearningJava.Head13;

/**
 * Created by user on 10.04.2017.
 */
import javax.swing.*;
import java.awt.*;

public class Panel0 {
    public static void main(String[] args) {
        Panel0 gui = new Panel0();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();

        JButton east = new JButton("east");
        JButton west = new JButton("west");
        JButton north = new JButton("north");
        JButton south = new JButton("south");
        JButton center = new JButton("center");

        frame.getContentPane().add(BorderLayout.EAST,east);
        frame.getContentPane().add(BorderLayout.WEST,west);
        frame.getContentPane().add(BorderLayout.NORTH,north);
        frame.getContentPane().add(BorderLayout.SOUTH,south);
        frame.getContentPane().add(BorderLayout.CENTER,center);

        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
