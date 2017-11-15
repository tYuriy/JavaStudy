package Java01Start.homeWork.lesson01_04;

import java.util.Scanner;

public class homeWork003 {
    public static void main(String[] args) {
        /*Написать программу, которая провери делится ли введенное пользователем число на 3*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String inpData = scanner.nextLine();
        int val = Integer.parseInt(inpData);
        int a = 3;
        int res = val % a;
        if (res == 0) {
            System.out.println("Number " + val + " divided by " + a + " without remainder");
        }
            else {
            System.out.println("Number " + val + " divided by " + a + " with remainder");
        }


    }
}
