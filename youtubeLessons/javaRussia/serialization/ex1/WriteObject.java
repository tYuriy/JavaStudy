package youtubeLessons.javaRussia.serialization.ex1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        String path = "src/youtubeLessons/javaRussia/serialization/people.bin";
        Person person1 = new Person(1,"bob");
        Person person2 = new Person(2,"joe");

        try {
            FileOutputStream fos = new FileOutputStream(path);//класс для записи чего угодно в файл
            ObjectOutputStream oos = new ObjectOutputStream(fos);//класс для записи объектов в файл

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
