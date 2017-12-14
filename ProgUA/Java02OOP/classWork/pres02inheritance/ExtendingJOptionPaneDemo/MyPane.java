package ProgUA.Java02OOP.classWork.pres02inheritance.ExtendingJOptionPaneDemo;

import javax.swing.*;

class MyPane extends JOptionPane {
    // Статический метод с двумя аргументами
// для отображения диалогового окна:
    static void showMessage(String txt,String title){
// Вызов статического метода showMessageDialog() из
// класса JOptionPane:
        showMessageDialog(null,txt,title,PLAIN_MESSAGE, new ImageIcon("src/ProgUA/pics/sm.png"));
    }
    // Статический метод с одним аргументом
// для отображения диалогового окна:
    static void showMessage(String txt){
// Вызов версии метода с двумя аргументами:
        showMessage(txt,"Сообщение");
    }
    // Продолжение на следующем слайде!!!
// Статический метод для отображения окна с полем ввода
// для считывания целого числа:
    static int getInteger(String txt){
// Текстовая переменная:
        String res;
// Отображение окна с полем ввода с помощью
// метода showInputDialog() из класса JOptionPane:
        res=showInputDialog(null,txt,"Число (по умолчанию 10)",QUESTION_MESSAGE);
// Проверяется значение текстовой переменной:
        if(res==null){
// Если пользователь отменил ввод числа
// (значение, возвращаемое по умолчанию):
            return 10;
        }
        else{
// Преобразование текстового представления числа в число:
            return Integer.parseInt(res);
        }
    }
}
