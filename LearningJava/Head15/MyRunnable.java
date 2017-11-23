package LearningJava.Head15;

/**
 * Created by superUser on 24.04.2017.
 */
public class MyRunnable implements Runnable {
    public void run (){
        go();
    }
    public void go(){
        doMore();
    }
    public void doMore(){
        System.out.println("top of the world");
    }
}
class ThreadTestDrive {
    public static void main(String[] args) {
        Runnable theJob = new MyRunnable();
        Thread t = new Thread(theJob);
        t.start();
        System.out.println("go back home");
    }
}
