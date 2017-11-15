package Java01Start.homeWork.lesson01_04;

import java.util.Scanner;

public class homeWork007 {
    public static void main(String[] args) {
        //Напишите программу, которая по номеру дня недели выводит его название

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 7");
        try {
        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Введеное число находится вне указанного диапазона");}
        }catch (NumberFormatException ex){
            System.out.println("Неправильный формат данных");
        }
    }
}
