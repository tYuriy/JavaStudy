package LearningJava.Head14.ReadAndWriteFile;

/**
 * Created by user on 11.04.2017.
 */
import java.io.*;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("Hi, Foo");//метод принимает строку
            writer.write("Bye!!!");//метод принимает строку
            writer.close();//нужно закрыть после записи
        } catch (Exception ex){ex.printStackTrace();}
    }
}
