package ProgUA.Java02OOP.classWork.presentation05.TryCatchExampleDemo;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

// Статический импорт:

// Главный класс:
class TryCatchExampleDemo{
    // Главный метод:
    public static void main(String[] args){
// Текстовая переменная для записи
// считываемого значения:
        String input;
// Переменная для записи целого числа:
        int num;
// Отображение диалогового кона с полем ввода:
        input=showInputDialog(null,
                "Введите число", // Текст над полем ввода
                "Число", // Название окна
                QUESTION_MESSAGE // Тип окна
        );
// Продолжение на следующем слайде!!!
// Блок контролируемого кода:
        try{
// Попытка преобразовать текст в число:
            num=parseInt(input);
// Отображение диалогового кона с числами:
            showMessageDialog(null,
// Отображаемый в окне текст:
                    "Числа "+(num-1)+", "+num+" и "+(num+1),
                    "Числа", // Название окна
                    INFORMATION_MESSAGE // Тип окна
            );
// Обработка ошибок (код выполняется,
// если в контрольном блоке возникла ошибка):
        }catch(Exception e){
// Отображение диалогового окна:
            showMessageDialog(null,
                    "Что-то пошло не так...", // Сообщение в окне
                    "Ошибка", // Название окна
                    ERROR_MESSAGE // Тип окна
            );
        }
    }
}