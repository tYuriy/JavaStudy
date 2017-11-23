package LearningJava.Head10.Foo;

/**
 * Created by user on 03.04.2017.
 */
public class Foo5 {
    static final int x = 12;
    public void go (final int x){
        System.out.println(x);
    }

    public static void main(String[] args) {
        Foo5 f = new Foo5();
        f.go(x);
    }
}
