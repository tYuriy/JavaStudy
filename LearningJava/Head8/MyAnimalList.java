package LearningJava.Head8;

/**
 * Created by user on 15.03.2017.
 */
public class MyAnimalList {
    private Animal [] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal was added in the cell " + nextIndex);
            nextIndex++;
        }
    }
}
