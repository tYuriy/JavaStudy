package Other.test;

/**
 * Created by user on 09.02.2017.
 */
public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        Cat.catsCount = ++Cat.catsCount;//напишите тут ваш код
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.addNewCat();
        Cat c2 = new Cat();
        c2.addNewCat();
        System.out.println(Cat.catsCount);
    }
}