package LearningJava.Head9;

/**
 * Created by user on 15.03.2017.
 */
public class TestDuck {
    public static void main(String[] args) {
        int weight = 8;
        float density = 2.3f;
        String name = "Donald";
        long[] feathers = {1,2,3,4,5,6};
        boolean canFly = true;
        int airspeed = 22;

        Duck[] d = new Duck[7];
        d[0] = new Duck ();
        d[1] = new Duck (density, weight);
        d[2] = new Duck (name, feathers);
        d[3] = new Duck (canFly);
        d[4] = new Duck (3.3f, airspeed);
        d[5] = new Duck (false);
        d[6] = new Duck (airspeed,density);
    }
}
class Duck{
    int pounds = 6;
    float floatability = 2.1f;
    String name = "universal";
    long[] feathers = {1,2,3,4,5,6,7};
    boolean canFly = true;
    int maxSpeed = 25;



    public Duck (){
        System.out.println("Duck N1");
    }
    public Duck (boolean fly){
        canFly = fly;
        System.out.println("Duck N2");
    }
    public Duck (String n, long[] f){
        name = n;
        feathers = f;
        System.out.println("Duck N3");
    }
    public Duck (int w, float f){
        pounds = w;
        floatability = f;
        System.out.println("Duck N4");
    }
    public Duck (float density, int max){
        floatability = density;
        maxSpeed = max;
        System.out.println("Duck N5");
    }
}