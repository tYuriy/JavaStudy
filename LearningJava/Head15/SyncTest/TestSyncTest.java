package LearningJava.Head15.SyncTest;

/**
 * Created by superUser on 24.04.2017.
 */
public class TestSyncTest {
    public static void main(String[] args) {
        TestSync job = new TestSync();
        Thread a = new Thread(job);
        Thread b = new Thread(job);
        a.start();
        b.start();
    }
}
