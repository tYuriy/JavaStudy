package LearningJava.Head12;

import java.awt.*;
import javax.swing.*;


/**
 * Created by user on 07.04.2017.
 */

//Создаем наследника JPanel - виджет, кот. вы сможете добавить во фрейм как любой другой
//только это будет ваш личный пользовательский виджет
public class MyDrawPanel extends JPanel {

    //Это графический метод, который вызывает система!!!
/*
    public void paintComponent(Graphics g){

        //g - машина для рисования, передаем ей цвет и фигуру, которую хотим получить.
        g.setColor(Color.BLUE);
        g.fillRect(20,50,100,100);

    }
*/
 /*
    public void paintComponent(Graphics g){

        //g - машина для рисования, передаем ей цвет и фигуру, которую хотим получить.
        Image image = new ImageIcon("C:\\Users\\user\\Desktop\\posters\\bp.jpg").getImage();
        g.drawImage(image,3,4,this);
    }
*/
 /*
    public void paintComponent(Graphics g){

        //g - машина для рисования, передаем ей цвет и фигуру, которую хотим получить.
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        int red= (int)(Math.random()*255);
        int green= (int)(Math.random()*255);
        int blue= (int)(Math.random()*255);

        Color randColor = new Color(red,green,blue);
        g.setColor(randColor);
        g.fillOval(70,70,100,100);

        //Graphics2D g2d = (Graphics2D)g;
        //g2d.fill3DRect(5,5,5,5,true);

    }
*/
 /*
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint grad = new GradientPaint(70,70,Color.BLUE,150,150,Color.GREEN);
        g2d.setPaint(grad);
        g2d.fillOval(70,70,150,150);
    }
*/
 ///*
    public void paintComponent (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);
        GradientPaint gradient = new GradientPaint(70, 150, startColor, 150, 70, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(100, 100, 100, 100);
    }
//*/
}
