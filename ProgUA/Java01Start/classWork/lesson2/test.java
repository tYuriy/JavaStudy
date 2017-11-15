package Java01Start.classWork.lesson2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class test {
    public static void main(String[] args) {
        String name;
        name=showInputDialog("What is your name?");
        if (name != null)
        showMessageDialog(null,"Hi, "+name+"!");

        char a = 'a';
        char b = 'b';
        int x = a+b;
        System.out.println(x);
    }
}
