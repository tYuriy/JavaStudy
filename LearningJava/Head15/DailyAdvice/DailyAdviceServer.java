package LearningJava.Head15.DailyAdvice;

import java.io.*;
import java.net.*;
/**
 * Created by superUser on 21.04.2017.
 */
public class DailyAdviceServer {
    String[] adviceList = {"Ешьте меньшими порциями","Купите облегающие джинсы","Два слова: не годится","Будьте честны хотя бы сегодня","Возможно, вам стоит подобрать другую прическу","Купи тройник","Будь добр","Хватит тупить","Жуй молча","Хорошо тебе"};

    public void go(){
        try{
            //ServerSocket app look for client requests on 13123 port, on the same pc, where this code executes
            ServerSocket serverSocket = new ServerSocket(13123);
            //server goes to constant loop expecting and servicing connections
            while (true){
                //accept() method blocks app while don't get request, after that return socket for client coop
                Socket socket = serverSocket.accept();
                //now we use connection Socket with client for creation PrintWriter unit, after
                //with help println() we send string with advice. Then we close socket, becouse
                //work with client is over.
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException ex){ex.printStackTrace();}
    }
    private String getAdvice() {
        int random = (int)(Math.random()*adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
