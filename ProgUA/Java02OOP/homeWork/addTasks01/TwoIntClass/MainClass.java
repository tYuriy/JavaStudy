package ProgUA.Java02OOP.homeWork.addTasks01.TwoIntClass;
/*
1. Напишите программу с классом, в котором есть два целочисленных поля.
В классе должно быть две версии конструктора: с двумя аргументами и без аргумента.
В классе должен быть метод, позволяющий создавать новый объект того же класса.
Метод вызывается из объекта класса и аргументом ему передается объект того же класса.
Результатом возвращается объект, значения полей которого равны сумме значений полей исходных объектов.
*/

public class MainClass {
    public static void main(String[] args) {
        TwoIntClass t1 = new TwoIntClass();
        TwoIntClass t2 = new TwoIntClass(5,9);
        System.out.println("Object 1\n" + t1.toString());
        System.out.println("Object 2\n" + t2.toString());
        TwoIntClass t3 = t1.objCreate(t2);
        System.out.println("Object 3\n" + t3.toString());
    }
}
