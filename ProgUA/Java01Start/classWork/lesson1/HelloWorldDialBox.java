package Java01Start.classWork.lesson1;//import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class HelloWorldDialBox {
    public static void main(String[] args) {
        /*
        showMessageDialog(null,"Dialog Box!");
        showMessageDialog(null,"Dialog Box!","Window Name",ERROR_MESSAGE);
        showMessageDialog(null,"Dialog Box!","Window Name",WARNING_MESSAGE);
        showMessageDialog(null,"Dialog Box!","Window Name",PLAIN_MESSAGE);
        showConfirmDialog(null,"Confirm Box!");
        String path;
        */
        //path =  "D:\download\Sg8VHja.jpg";
        showMessageDialog(null,new ImageIcon("D:/download/pict.jpg"));
    }
}
