package LearningJava.Head15.SyncTest;

/**
 * Created by superUser on 24.04.2017.
 */
public class TestSync implements Runnable {
    private int balance;
    public void run(){
        for (int i=0; i<50;i++){
            increment();
            System.out.println("balance = " + balance);
        }
    }
    public synchronized void increment(){
        int i = balance;
        balance = i+1;
    }
}

