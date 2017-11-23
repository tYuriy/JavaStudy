package LearningJava.Head15.DailyAdvice;

/**
 * Created by superUser on 19.05.2017.
 */
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SimpleChatClient {
    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket socket;

    public static void main(String[] args) {
        SimpleChatClient client = new SimpleChatClient();
        client.go();
    }

    public void go(){
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel mainPanel = new JPanel();
        incoming = new JTextArea(15,50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(qScroller);
        //mainPanel.add(incoming);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        setUpNetworking();
        //we launch new thread by using inner class as Runnable (task). Thread work
        //contains in reading data from server through the socket and output any input messages in
        //scrolling test area
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
        frame.setSize(400,500);
        frame.setVisible(true);
    }

    private void setUpNetworking(){
        //we use socket to get incoming and outgoing threads. Outgoing thread already
        //done for senging data, but now we add to it incomnig thread, so now our object
        //Thread can get messages from server
        try{
            socket = new Socket("127.0.0.1",5000);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("networking established");
        } catch (IOException ex){ex.printStackTrace();};
    }

    public class SendButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent ev){
            try {
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex) {ex.printStackTrace();}
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public class IncomingReader implements Runnable {
        public void run(){
            String message;
            try {
                while ((message = reader.readLine())!=null){
                    System.out.println("read " + message);
                    incoming.append(message + "\n");
                }
            } catch (Exception ex) {ex.printStackTrace();}
        }
    }
}
