package Java01Start.classWork.lesson2;

import java.util.Scanner;

public class EnteringValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x,y;
        String txt;
        System.out.println("Enter first number: ");
        x = Integer.parseInt(scanner.nextLine());
        //x = scanner.nextInt();
        System.out.println("Enter text: ");
        txt = scanner.nextLine();
        System.out.println("Enter second number: ");
        y = scanner.nextInt();

        System.out.println("Numbers: " + x + "& " + y+".");
        System.out.println("Text: " + txt + ".");
    }
}
