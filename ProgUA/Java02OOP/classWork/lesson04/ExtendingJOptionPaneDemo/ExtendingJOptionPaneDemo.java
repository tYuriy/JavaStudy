package ProgUA.Java02OOP.classWork.lesson04.ExtendingJOptionPaneDemo;

// Продолжение на следующем слайде!!!
// Класс с главным методом программы:
class ExtendingJOptionPaneDemo{
    public static void main(String[] args){
// Отображение диалогового окна с сообщением:
        MyPane.showMessage("Всем привет!");
// Переменная для записи числового значения:
        int number;
// Отображение диалогового окна с полем ввода
// и считывание целочисленного значения:
        number=MyPane.getInteger("Введите целое число");
// Текст для отображения в диалоговом окне:
        String txt="Числа от 1 до "+number+":\n";
// Формирование текстовой строки с
// последовательностью натуральных чисел:
        for(int k=1;k<=number;k++){
            txt+=k+" ";
        }
// Отображение диалогового окна с сообщением:
        MyPane.showMessage(txt,"Целые числа");
    }
}
