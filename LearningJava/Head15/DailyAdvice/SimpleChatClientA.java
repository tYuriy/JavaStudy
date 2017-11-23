package LearningJava.Head15.DailyAdvice;

import javax.swing.*;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by superUser on 21.04.2017.
 */
public class SimpleChatClientA {

    JTextField outgoing;
    PrintWriter writer;
    Socket socket;

    public void go(){
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
        setUpNetworking();
        frame.setSize(400,500);
        frame.setVisible(true);
    }
    private void setUpNetworking(){
        try {
            //using localhost allows test client and server on one pc
            socket = new Socket("127.0.0.1", 5000);
            //create objects Socket and PrintWriter (this method calls right before launch GUI)
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("networking established");
        } catch (IOException ex){ex.printStackTrace();}
    }
    public class SendButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent event){
            try {
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex){ex.printStackTrace();}
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }
}
