package Java01Start.homeWork.lesson01_04;

import static javax.swing.JOptionPane.*;

public class homeWork008 {
    public static void main(String[] args) {

        /*Программа, которая распознает введенное число как целое или десятичное,
        а также требует ввода числа, если введенных данных нет либо данные некорректны.
         */

        String inpMsg = "Введите какое-нибудь число";
        String inpTitle1 = "Ввод данных";
        String inpTitle2 = "Результат";
        String inpInt = "Введено целое число ";
        String inpDbl = "Введено десятичное число ";
        String inpErr = "Введенные данные не являются числом, \nпопробуйте еще раз";
        String inpNull = "Ничего не введено, нужно ввести число, \nпопробуйте еще раз";

        int iconInf = INFORMATION_MESSAGE;
        int iconErr = ERROR_MESSAGE;

        boolean a = true;

        showMessageDialog(null,"Понеслась!", "Сообщение",PLAIN_MESSAGE);

        //цикл ввода значения в диалоговое окно
        while (a){
            String newTxt=showInputDialog(null, inpMsg, inpTitle1, iconInf);
            try {
                int newValue = Integer.parseInt(newTxt);//попытка преобразования в целое число
                showMessageDialog(null,inpInt + newValue,inpTitle2,iconInf);
                a=false;
            } catch (NumberFormatException ex0) {
                try {
                    double newValue = Double.parseDouble(newTxt);//попытка преобразования в десятичное число
                    showMessageDialog(null,inpDbl+ newValue,inpTitle2,iconInf);
                    a=false;
                } catch (NumberFormatException ex1) {
                    showMessageDialog(null,inpErr,inpTitle2,iconErr);//окно ошибки в случае ввода текста или пустой строки
                } catch (NullPointerException ex2) {
                    showMessageDialog(null,inpNull,inpTitle2,iconErr);//окно ошибки если ввода не было
                }
            }
        }
        showMessageDialog(null,"Молодец! \nРабота программы окончена", "Ура",PLAIN_MESSAGE);
    }
}
