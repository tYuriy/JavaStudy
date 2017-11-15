package ProgUA.Java02OOP.homeWork.lesson02.SwapArgs;

/*
Напишите программу с классом, в котором есть два поля (символьное и целочисленное) и метод,
аргументом которому передается объект того же класса.
При вызове метода объекту, из которого вызывается метод,
присваиваются значения полей объекта, переданного аргументом методу.
У объекта, переданного аргументом методу, значения полей увеличиваются на единицу.
 */
public class SwapArgs {
    public static void main(String[] args) {
        SomeClass scOne = new SomeClass('F',999);
        System.out.println("Значения полей первого объекта после создания:");
        scOne.show();
        SomeClass scTwo = new SomeClass();
        System.out.println("Значения полей второго объекта после создания:");
        scTwo.show();
        scTwo.swapArgs(scOne);
        System.out.println("Значения полей первого объекта после выполнения метода:");
        scOne.show();
        System.out.println("Значения полей второго объекта после выполнения метода:");
        scTwo.show();
    }
}