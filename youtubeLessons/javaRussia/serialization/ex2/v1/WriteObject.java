package youtubeLessons.javaRussia.serialization.ex2.v1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        String path = "src/youtubeLessons/javaRussia/serialization/arrPeople.bin";
        Person person1 = new Person(1,"bob");
        Person person2 = new Person(2,"joe");
        Person [] people = {new Person(3,"tom"), person1,person2};

        try {
            FileOutputStream fos = new FileOutputStream(path);//класс для записи чего угодно в файл
            ObjectOutputStream oos = new ObjectOutputStream(fos);//класс для записи объектов в файл

            oos.writeInt(people.length);
            for (Person p: people) {
                oos.writeObject(p);
            }

            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
