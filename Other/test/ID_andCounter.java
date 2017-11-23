package Other.test;

/**
 * Created by user on 03.04.2017.
 */
public class ID_andCounter {
    int id;
    static int counter;
    //final int cc = 14;
    public static final double AN_INT;
    static {
        AN_INT = (double) Math.random();
    }
    ID_andCounter(){
        counter++;
        id= counter * 11;
    }
    public static void main(String[] args) {
        ID_andCounter obj1 = new ID_andCounter();
        //System.out.println(counter);

        ID_andCounter obj2 = new ID_andCounter();
        //System.out.println(counter);

        ID_andCounter obj3 = new ID_andCounter();
        ID_andCounter obj4 = new ID_andCounter();
        System.out.println(counter);
        System.out.println(obj1.id);
        System.out.println(obj2.id);
        System.out.println(obj3.id);
        System.out.println(obj4.id);

    }
}


