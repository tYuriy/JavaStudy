package ProgUA.Java01Start.classWork.addInfo;

import javax.swing.*;
import static javax.swing.JOptionPane.*;

/*import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showConfirmDialog;*/


public class JOptionWindows {
public static void main(String[] args) {
        String title="Title";
        String txt="some test";
        String[] arr = {"one","two","three","four"};
        String x = arr[1];
        showInputDialog(null,txt,title, ERROR_MESSAGE, new ImageIcon("src/ProgUA/pics/sm.png"),arr,x);
//        showMessageDialog(null,txt,title,QUESTION_MESSAGE, new ImageIcon("src/ProgUA/pics/sm.png"));
//        showConfirmDialog(null,txt,title,YES_NO_CANCEL_OPTION,QUESTION_MESSAGE,new ImageIcon("src/ProgUA/pics/cg.png"));
//        showConfirmDialog(null,txt,title,1,QUESTION_MESSAGE,new ImageIcon("src/ProgUA/pics/cg.png"));
        showOptionDialog(null,txt,title,YES_NO_CANCEL_OPTION,1,new ImageIcon("src/ProgUA/pics/cg.png"),/*arr*/null,x);
    }
}
