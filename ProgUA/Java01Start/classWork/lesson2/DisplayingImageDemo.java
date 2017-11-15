package Java01Start.classWork.lesson2;

// Импорт библиотеки:
import javax.swing.*;
// Статический импорт из класса JOptionPane:
import static javax.swing.JOptionPane.*;
class DisplayingImageDemo{
    public static void main(String[] args){
// Отображение окна с изображением:
        showMessageDialog(null,
// Объект изображения:
                new ImageIcon("C:\\Users\\aUser\\IdeaProjects\\testProject\\out\\ezhyk.jpg"),
                "Панда", // Название
                PLAIN_MESSAGE // Нет пиктограммы
        );
    }
}