package Java01Start.homeWork.lesson01_04;

import java.util.Scanner;

import static javax.swing.JOptionPane.*;

public class homeWork001 {
    public static void main(String[] args) {
        /*Измените код программы для вычисления возраста так, чтобы второе окно (с сообщением о возрасте) содержало
        пиктограмму ошибки и имело название "Возраст определен".
         */
        int thisYear=2017;
        int age =0;
        int year = 0;
        String res;
        String txt = "Your age is: ";

        res= showInputDialog(null,"Year of birth:", "Age calculation", QUESTION_MESSAGE);

        year = Integer.parseInt(res);
        age = thisYear - year;
        showMessageDialog(null, txt + age,"Age defined",WARNING_MESSAGE);

        /*Напишите программу для вычисления возраста используя консольный ввод и вывод*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Year of birth:");

        res = scanner.nextLine();
        year = Integer.parseInt(res);
        age = thisYear - year;

        System.out.println(txt + age);

    }
}
