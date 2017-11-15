package ProgUA.Java01Start.classWork.lesson6;

import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class UsingListDemo {
    public static void main(String[] args) {
        String[] txt={"Ёжик","Тушканчик","Лисица","Главоглаз"}; // Названия животных
        // Названия файлов с изображениями животных:
        String[] files={"ezhyk.jpg","tushkan.jpg","fox.jpg","gl.png"};
        String folder="E:\\MEGA\\java\\pics\\";//"d:/books/pictures/"; // Путь к файлам
        String msg="Кого показать?"; // Текст в окне
        String title="В мире животных"; // Название окна
        ImageIcon img=new ImageIcon(folder+"ezhyk.jpg"); // Пиктограмма
        String animal; // Имя выбранного животного
        animal=(String)showInputDialog(null,
                msg, // Текст над раскрывающимся списком
                title, // Название окна
                PLAIN_MESSAGE, // Тип окна (не влияет на результат)
                img, // Пиктограмма, отображаемая в окне
                txt, // Элементы раскрывающегося списка
                txt[0] // Выбранный по умолчанию элемент
        );
        if(animal==null){ // Если пользователь отменил ввод
            System.exit(0); // Завершение выполнения программы
        }
        for(int k=0;k<txt.length;k++){ // Определение пиктограммы
            if(animal.equals(txt[k])){
                img=new ImageIcon(folder+files[k]); // Создание пиктограммы
                break; // Завершение оператора цикла
            }
        }
        // Отображение диалогового окна:
        showMessageDialog(null,
                img, // Изображение
                animal, // Название окна
                PLAIN_MESSAGE // Тип окна
        );
    }
}
