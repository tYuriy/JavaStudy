package LearningJava.Head10;

/**
 * Created by user on 06.04.2017.
 */
class StaticSuper{
    static {
        System.out.println("Parent static block");
    }
    StaticSuper(){
        System.out.println("Parent constructor");
    }
}

public class StaticTest extends StaticSuper {
    static int rand;
    static {
        rand = (int)(Math.random()*6);
        System.out.println("Static block" + rand);
    }
    StaticTest(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        StaticTest st = new StaticTest();
    }
}
