package Java01Start.homeWork.lesson01_04;

import java.util.Scanner;

import static javax.swing.JOptionPane.*;

public class homeWork002 {
    public static void main(String[] args) {
        //Напишите программу вычисления года рождения по возрасту
        int birthYear;
        int age;
        int currentYear =2017;
        String inpData;
        String msg1="Enter your age: ";
        String msg2="Your birth age is: ";

        Scanner scanner = new Scanner(System.in);
        System.out.println(msg1);
        inpData = scanner.nextLine();
        age = Integer.parseInt(inpData);
        birthYear = currentYear-age;
        System.out.println(msg2 + birthYear);



        age = Integer.parseInt(showInputDialog(null,msg1,"Birth year calculation", QUESTION_MESSAGE));
        birthYear = currentYear-age;
        showMessageDialog(null,msg2+birthYear,"Birth year",INFORMATION_MESSAGE);



    }
}
