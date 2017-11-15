package Java01Start.homeWork.lesson01_04;
//import java.util.Scanner;
import static javax.swing.JOptionPane.*;

public class homeWork005 {
    public static void main(String[] args) {

        //Напишите программу, которая проверяет делится ли введенное число на 3 и/или 7

        String ttl="Введите целое число:";

        /*Scanner scanner = new Scanner(System.in);
        System.out.println(ttl);
        String str = scanner.nextLine();*/

        String str = showInputDialog(null,ttl,"Проверка делителя",INFORMATION_MESSAGE);

        int num = Integer.parseInt(str);
        int del1 = 3;//первый делитель
        int del2 = 7;//второй делитель

        //возможные сообщения после расчета
        String txt1 = "Число " + num + " делится на " + del1 + " и на " + del2;
        String txt2 = "Число " + num + " делится только на " + del1;
        String txt3 = "Число " + num + " делится только на " + del2;
        String txt4 = "Число " + num + " не делится на " + del1+ " и на "+ del2;
        String txt="";//переменная для сообщения в итоговом окне

        int x = (num%del1==0)?1:0;//проверка остатка при делении на 1й делитель
        int y = (num%del2==0)?10:0;//проверка остатка при делении на 2й делитель

        int z = x+y;

        if (z==11) {
            //System.out.println(txt1);
            txt = txt1;
        } else if (z==1){
            //System.out.println(txt2);
            txt = txt2;
        } else if (z==10){
            //System.out.println(txt3);
            txt = txt3;
        } else if (z==0){
            //System.out.println(txt4);
            txt = txt4;}

        showMessageDialog(null,txt,"Результат",INFORMATION_MESSAGE);
    }
}
