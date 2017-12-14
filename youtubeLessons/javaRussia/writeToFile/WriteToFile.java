package youtubeLessons.javaRussia.writeToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        String dir = "src/youtubeLessons/writeToFile/newFile";//путь к файлу
        File file = new File(dir);//создание объекта файла
        PrintWriter pw = new PrintWriter(file);//создание объекта, который записывает инфо в файл

        Scanner scanner = new Scanner(System.in);//создание объекта сканнер

        pw.println(scanner.nextLine());//запись в файл строки из консоли
        pw.println(scanner.nextLine());

        pw.close();//закрыть объект для записи

        scanner = new Scanner(file);//изменение объекта сканер для считывания инфо из файла

        while (scanner.hasNextLine()){//читаем файл пока метод возвращает true
            System.out.println(scanner.nextLine());//выводим на экран результат чтения строки
        }
        scanner.close();//закрываем сканнер
    }
}
