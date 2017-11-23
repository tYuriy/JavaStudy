package LearningJava.Head10.Foo;

/**
 * Created by user on 03.04.2017.
 */
public class Foo6 {
    int x =12;
    final static int y=5;
    public static void go(final int x){
        System.out.println(x);
    }

    public static void main(String[] args) {
        Foo6 f = new Foo6();
        Foo6.go(y);
    }
}
