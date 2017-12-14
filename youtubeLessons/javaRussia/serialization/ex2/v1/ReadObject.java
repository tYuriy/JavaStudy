package youtubeLessons.javaRussia.serialization.ex2.v1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        String path = "src/youtubeLessons/javaRussia/serialization/arrPeople.bin";
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

            int persCnt = ois.readInt();
            Person[] people = new Person[persCnt];
            for (int i = 0; i < persCnt; i++) {
                people[i] = (Person) ois.readObject();

            }

//            for (Person p : people) {
//                System.out.println(p);
//            }
            System.out.println(Arrays.toString(people));

            ois.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
