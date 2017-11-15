package Java01Start.homeWork.lesson01_04;

import java.util.Scanner;

import static javax.swing.JOptionPane.*;

public class homeWork004 {
    public static void main(String[] args) {
        //Написать программу, которая проверяет сколько тысяч во введенном пользователем числе
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String inpData = scanner.nextLine();
        int val = Integer.parseInt(inpData);

        int res1 = val/1000%10;
        //int res2 = res1%10;
        System.out.println("В введенном числе " + res1 +" тысяч.");

        //То же, с диалоговыми окнами:
        String inpData2 = showInputDialog(null,"Enter a whole number: ", "Entering Value", QUESTION_MESSAGE);
        val = Integer.parseInt(inpData2);
        int res2 = val/1000%10;
        showMessageDialog(null,"Number of thousends: " + res2, "Result", INFORMATION_MESSAGE);

    }
}
