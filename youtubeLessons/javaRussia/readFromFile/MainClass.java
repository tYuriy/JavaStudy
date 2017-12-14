package youtubeLessons.javaRussia.readFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;//присваиваем переменной системный разделитель
        //String path = "E:" +separator + "test.txt";//or "E:\\test.txt"; or "E:/test.txt"
        String path = "src/youtubeLessons/readFromFile/test";
        File file = new File(path);//создаем файл на основании пути к нему

        Scanner scanner = new Scanner(file);//создаем сканер с источником чтения: файд
        while (scanner.hasNextLine()){//читаем файл пока метод возвращает true
            System.out.println(scanner.nextLine());//выводим на экран результат чтения строки
        }

        scanner.close();//закрываем сканнер

        path = "src/youtubeLessons/readFromFile/test2";
        file = new File(path);

        scanner = new Scanner(file);

        String line = scanner.nextLine();//считываем строку из файл (там одна строка)
        String[] numbers = line.split(" ");//создаем массив строк с разделителем " "
//        for (String c:numbers) {//выводим в цикле все элементы массива
//            System.out.println(c);
//        }
        System.out.println(Arrays.toString(numbers));//выводим массив с помощью статического метода класса Arrays


    }
}
