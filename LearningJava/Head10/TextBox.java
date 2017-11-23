package LearningJava.Head10;

/**
 * Created by user on 03.04.2017.
 */
public class TextBox {
    Integer i;
    int j;

    public static void main(String[] args) {
        TextBox t = new TextBox();
        t.go();
    }
    public void go(){
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}
