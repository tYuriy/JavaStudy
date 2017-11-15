package ProgUA.Java02OOP.homeWork.lesson02.TwoClassesProgram;

/*
Напишите программу с двумя классами. У первого класса есть целочисленное поле.
У второго класса есть символьное поле. В первом классе есть метод,
аргументом которому передается объект второго класса.
При вызове этого метода полю объекта, из которого вызывается метод,
значением поля объекта переданного аргументом методу.
У второго класса есть метод,
аргументом которому передается объект первого класса.
Значением полю объекта, из которого вызывается метод,
присваивается символ с кодом, определяемым значением поля объекта,
переданного аргументом методу.
 */
public class TwoClassesProgram {
    public static void main(String[] args) {
        ClassChar cc = new ClassChar('&');
        ClassInt ci = new ClassInt();
        System.out.println("Вывод полей после создания экземпляров класса:");
        System.out.println("Числовое поле первого класса: " + ci.getNum());
        System.out.println("Символьное поле второго класса: " + cc.getSymb());
        System.out.println();
        ci.setNumBySymb(cc);

        System.out.println("Вывод полей после вызова метода из класса с числовым полем:");
        System.out.println("Числовое поле первого класса: " + ci.getNum());
        System.out.println("Символьное поле второго класса: " + cc.getSymb());
        System.out.println();

        ci.setNum(61);
        System.out.println("Изменяем значение числового поля класса:");
        System.out.println("Числовое поле первого класса: " + ci.getNum());
        System.out.println();

        cc.setSymbByNum(ci);
        System.out.println("Вывод полей после вызова метода из класса с символьным полем:");
        System.out.println("Числовое поле первого класса: " + ci.getNum());
        System.out.println("Символьное поле второго класса: " + cc.getSymb());

    }
}