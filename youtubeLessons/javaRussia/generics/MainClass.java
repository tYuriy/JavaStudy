package youtubeLessons.javaRussia.generics;

import java.util.List;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ///////////////////Java 5\\\\\\\\\\\\\\\\\\\\\\
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);//можно добавить любой об]trn

        String animal = (String)animals.get(1);//преобразование в строку, т.к. мы знаем, что в объект = строка.
        System.out.println(animal);//здесь будет ошибка, т.к. объект не стринг!

        animal = (String)animals.get(3);
        //////////////////////generics\\\\\\\\\\\\\\\\\\\\\\\\\\
        List<String> animals2 = new ArrayList<>();
        animals2.add("cat");
        animals2.add("snake");
        animals2.add("kid");
        //animals2.add(ourAnimal); несовместимые типы

        String animal2 = animals2.get(2);


    }
}
