package ProgUA.Java01Start.classWork.lesson3;

import static javax.swing.JOptionPane.*;

public class AnotherIfDemo{
    public static void main(String[] args){
        int icon=ERROR_MESSAGE;
        // Тип пиктограммы
        // Переменные с начальными значениями:
        String msg="Очень жаль что мы не познакомились!",
                title="Знакомство не состоялось",
                name;
                name=showInputDialog(null,
                                     "Как Вас зовут?",
                                     "Знакомимся",
                                      QUESTION_MESSAGE);
                if(name!=null){
                    // Если ссылка не пустая
                    // Новый тип пиктограммы:
                    icon=INFORMATION_MESSAGE;
                    // Новый текст сообщения:
                    msg="Очень приятно, "+name+"!";
                    // Новый заголовок:
                    title="Знакомство состоялось";         }
                    showMessageDialog(null,msg,title,icon);
    }
}