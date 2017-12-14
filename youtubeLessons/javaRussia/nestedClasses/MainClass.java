package youtubeLessons.javaRussia.nestedClasses;

public class MainClass {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        Electrocar.Battery battery = new Electrocar.Battery();
    }
}
