package ProgUA.Java02OOP.homeWork.lesson02.ClassByMethod;

/*
Напишите программу с классом, в котором есть символьное поле.
В главном классе опишите статический метод,
который на основании символьного аргумента создает объект соответствующего класса.
 */

public class ClassByMethod {
    public static void createEx (char symb){
        new CharClass(symb);
    }
    public static void main(String[] args) {
        ClassByMethod.createEx('x');
    }
}