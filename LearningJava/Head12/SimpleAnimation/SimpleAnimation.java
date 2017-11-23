package LearningJava.Head12.SimpleAnimation;

import LearningJava.Head12.MyDrawPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 07.04.2017.
 */
public class SimpleAnimation {
    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);

        for (int i=0; i<130; i++){
            x++;//y++;

            drawPanel.repaint();

            try {Thread.sleep(50);
            }catch (Exception ex){}
        }

    }
    class MyDrawPanel extends JPanel{
        public void paintComponent (Graphics g){
            g.setColor(Color.cyan);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            g.setColor(Color.blue);
            g.fillOval(x,y,40,40);
        }
    }
}
