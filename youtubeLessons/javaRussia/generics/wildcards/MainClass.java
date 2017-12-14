package youtubeLessons.javaRussia.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(5));
        listOfAnimal.add(new Animal(55));

        test(listOfAnimal);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfDogs);
    }
    //? extends Animal = разрешает использовать в методе класс Animal и все классы, которые его наследуют
    //? super Animal = разрешает использовать в методе класс Animal и все классы, которые находятся выше него в иерархии
    private static void test (List</*Animal*/? extends Animal> list){
        for (Animal animal: list) {
            System.out.println(animal);
            animal.eat();
        }
    }
}
