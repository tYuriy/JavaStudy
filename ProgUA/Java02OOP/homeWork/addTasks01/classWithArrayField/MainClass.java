package ProgUA.Java02OOP.homeWork.addTasks01.classWithArrayField;

/*
7. Напишите программу с классом, у которого есть поле, представляющее собой числовой массив.
Предусмотреть разные способы создания объектов класса (в том числе на основе уже существующего объекта).
Описать метод для создания на основе двух объектов нового объекта с массивом, элементы которого определяются
как среднее арифметическое соответствующих элементов в массивах складываемых объектов.
Предложить метод, возвращающий результатом среднее арифметическое значение элементов массива из данного объекта.
 */

public class MainClass {
    public static void main(String[] args) {
        NewClass newClass = new NewClass();
        System.out.println("Массив 1 создан с помощью конструктора, без параметров");
        System.out.println(newClass.toString());
        NewClass nc1 = new NewClass(6);
        System.out.println("Массив 2 создан с помощью конструктора, параметр - число");
        System.out.println(nc1.toString());
        NewClass nc2 = new NewClass(nc1);
        System.out.println("Массив 3 создан с помощью конструктора, параметр - объект");
        System.out.println(nc2.toString());
        NewClass nc3 = NewClass.createNewObj(newClass,nc1);
        System.out.println("Массив 4 создан с помощью метода, из двух объектов");
        System.out.println(nc3.toString());
        System.out.println("Среднее арифметическое элементов массива 1");
        System.out.printf("%.2f", newClass.calcAverageOfArr());
        System.out.println();
        System.out.println("Среднее арифметическое элементов массива 2");
        System.out.printf("%.2f", nc1.calcAverageOfArr());
    }
}
