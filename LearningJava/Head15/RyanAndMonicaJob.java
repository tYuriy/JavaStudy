package LearningJava.Head15;

/**
 * Created by superUser on 24.04.2017.
 */
class BankAccount {
    private int balance = 100;
    public int getBalance(){
        return balance;
    }
    public void withdraw (int amount){
        balance = balance - amount;
    }
}
public class RyanAndMonicaJob implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }
    public void run(){
        for (int x = 0;x<10;x++){
            makeWithdrawal(10);
            if(account.getBalance()<0){
                System.out.println("over budget operation ");
            }
        }
    }
    private synchronized void makeWithdrawal(int amount){
        if(account.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName() + " going to get some money");
            try {
                System.out.println(Thread.currentThread().getName() + " going to sleep");
                Thread.sleep(500);
            } catch (InterruptedException ex){ex.printStackTrace();}
            System.out.println(Thread.currentThread().getName() + " waking up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " finishing transaction");
        } else {
            System.out.println("sorry, for client " + Thread.currentThread().getName() + " not enough money");
        }
    }
}
