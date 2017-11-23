package LearningJava.Head12;

/**
 * Created by user on 07.04.2017.
 */
public class MyOuter {
    private int x;
    MyInner inner = new MyInner();
    public void doStuff(){
        inner.go();
        System.out.println(x);
    }
    class MyInner {
        void go(){
            x=42;
        }
    }

    public static void main(String[] args) {
        MyOuter mo = new MyOuter();
        mo.doStuff();
    }
}
