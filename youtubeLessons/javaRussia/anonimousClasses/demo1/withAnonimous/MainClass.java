package youtubeLessons.javaRussia.anonimousClasses.demo1.withAnonimous;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        youtubeLessons.javaRussia.anonimousClasses.demo1.withAnonimous.Animal animal1 = new youtubeLessons.javaRussia.anonimousClasses.demo1.withAnonimous.Animal();
        animal1.eat();

        //переопределяем метод "eat" только для объекта "animal2"
        //в переменной "animal2" находится наследник класса "Animal" с переопределенным классом "eat"
        youtubeLessons.javaRussia.anonimousClasses.demo1.withAnonimous.Animal animal2 = new youtubeLessons.javaRussia.anonimousClasses.demo1.withAnonimous.Animal(){
            @Override
            public void eat() {
                System.out.println("other animal is eating");
            }
        };
        animal2.eat();

        youtubeLessons.javaRussia.anonimousClasses.demo1.withAnonimous.Animal animal3 = new youtubeLessons.javaRussia.anonimousClasses.demo1.withAnonimous.Animal();
        animal3.eat();

        List<youtubeLessons.javaRussia.anonimousClasses.demo1.withAnonimous.Animal> list = new ArrayList<>();
        list.add(animal1);
        list.add(animal2);
        list.add(animal3);

    }
    public static void test (youtubeLessons.javaRussia.anonimousClasses.demo1.withAnonimous.Animal animal){
        animal.eat();
    }
}
