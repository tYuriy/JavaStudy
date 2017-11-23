package Other.javabuddy.hw;

import java.util.Scanner;

/**
 * Created by user on 03.02.2017.
 */
public class Fraction { //Создаем класс дроби
    int numerator; //переменная числителя
    int denominator; //переменная знаменателя

    public int setNumerator() { //метод для ввода исходных данных числителя
        //this.numerator = numerator;
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        return val;
    }

    public int setDenominator() { //метод для ввода исходных данных знаменателя
        //this.denominator = denominator;
        Scanner sc = new Scanner(System.in);
        boolean x = true;
        while (x) {//цикл проверки данных указанному условию
            int val = sc.nextInt();
            if (val != 0) {
                //System.out.println("It's ok!");
                x = false;
                return val;
            } else {
                System.out.println("Wrong value. Try again.");
            }
        }
        return 0;
    }

    void addition(int a, int b, int c, int d) { //метод сложения дробей
        int newNom = a * d + c * b;
        int newDenom = b * d;
        System.out.println("Result of addiction " + newNom + "/" + newDenom);
        reduction(newNom,newDenom);
    }

    void subtraction(int a, int b, int c, int d) { //метод вычитания дробей
        int newNom = a * d - c * b;
        int newDenom = b * d;
        System.out.println("Result of subtraction " + newNom + "/" + newDenom);
        reduction(newNom,newDenom);
    }

    void multiplication(int a, int b, int c, int d) { // метод умножения дробей
        int newNom = a * c;
        int newDenom = b * d;
        System.out.println("Result of multiplication " + newNom + "/" + newDenom);
        reduction(newNom,newDenom);
    }

    void division(int a, int b, int c, int d) { //метод деления дробей
        int newNom = a * d;
        int newDenom = b * c;
        System.out.println("Result of division " + newNom + "/" + newDenom);
        reduction(newNom,newDenom);
    }

    void reduction (int a, int b){ //метод сокращения дроби
        int newA=0, newB=0;
        for (int i = Math.min(Math.abs(a),Math.abs(b)); i > 1; i--){
            if (a%i == 0 & b%i == 0){
                newA = a/i;
                newB = b/i;
                break;
            } else {
                newA = a;
                newB = b;
            }
        }
        System.out.println("After reduction " + newA +"/"+ newB);
        allocation(newA, newB);
    }
    void allocation (int a, int b){ //метод выделения целой части дроби
        if (Math.abs(a) > b){
            System.out.println("Allocation of whole part: " + a/b + " " + Math.abs(a%b) + "/" + b);
        }
    }
}

class FracrionTest {
    public static void main(String[] args) {

        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
//        Fraction f3 = new Fraction();
        System.out.println("Enter numerator #1:");
        f1.numerator= f1.setNumerator();
        System.out.println("Enter denomerator #1:");
        f1.denominator = f1.setDenominator();
        System.out.println("Enter numerator #2:");
        f2.numerator = f2.setNumerator();
        System.out.println("Enter denomerator #2:");
        f2.denominator = f2.setDenominator();

        f1.addition(f1.numerator, f1.denominator, f2.numerator, f2.denominator);
        System.out.println();
        f1.subtraction(f1.numerator, f1.denominator, f2.numerator, f2.denominator);
        System.out.println();
        f1.multiplication(f1.numerator, f1.denominator, f2.numerator, f2.denominator);
        System.out.println();
        f1.division(f1.numerator, f1.denominator, f2.numerator, f2.denominator);
    }
}