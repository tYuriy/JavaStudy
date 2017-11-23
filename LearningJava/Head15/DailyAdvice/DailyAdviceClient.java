package LearningJava.Head15.DailyAdvice;

/**
 * Created by superUser on 21.04.2017.
 */
import java.io.*;
import java.net.*;//class socket from java.net

public class DailyAdviceClient {
    public void go(){
        try{ //here smthing might happened
            //create connection through the socket to app, which works on 4242 port, on the same PC,
            //where this code running (localhost)
            Socket s = new Socket("127.0.0.1",13123);

            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            //connect BufferedReader to InputStreamReader, which already connected with outgoing
            //flow from socket
            BufferedReader reader = new BufferedReader(streamReader);
            //readLine() method works same as if BufferedReader was connected to file,
            //other words, when you work with BufferedReader, you don't know where symbols from
            String advice = reader.readLine();
            System.out.println("Today you need: " + advice);
            //here all flows close
            reader.close();
        } catch (IOException ex){ex.printStackTrace();}
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
