package LearningJava.Head12;

/**
 * Created by user on 06.04.2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("WOW");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);

        frame.setVisible(true);
        button.setSize(200,50);

        MyDrawPanel mdp = new MyDrawPanel();
        frame.getContentPane().add(mdp);
        //mdp.paintComponent();
    }
    public void actionPerformed (ActionEvent event){
        //MyDrawPanel mdp = new MyDrawPanel();


        if (button.getText().equals("WOW"))
        {button.setText("WTF");
        button.setSize(100,200);
        } else {button.setText("WOW");
        button.setSize(200,100);}


    }
    /*class MyDrawPanel extends JPanel {

        //Это графический метод, который вызывает система!!!
        public void paintComponent(Graphics g){

            //g - машина для рисования, передаем ей цвет и фигуру, которую хотим получить.
            g.setColor(Color.BLUE);
            g.fillRect(20,50,100,100);
        }
    }*/
}
