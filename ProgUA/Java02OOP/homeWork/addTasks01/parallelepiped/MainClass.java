package ProgUA.Java02OOP.homeWork.addTasks01.parallelepiped;
/*
* 2. Напишите программу, в которой создается класс для описания такого физического объекта, как "параллелепипед".
* У класса три поля: ширина, глубина и высота, а также метод для вычисления объема (произведение значений полей объекта).
* Предусмотреть наличие конструктора и метода для отображения характеристик объекта.
* Рассмотрите механизм наследования, создав на основе класса подкласс с дополнительным полем, определяющим массу "параллелепипеда".
* Добавить в подклассе метод для вычисления плотности материала, из которого сделан "параллелепипед" (массу нужно поделить на объем).
* Подумайте над тем, как добавить в класс методы * для выполнения некоторых простых операций с объектами:
* например, метод для уменьшения массы "параллелепипеда" в определенное количество раз,
* или метод для создания нового объекта на основе двух уже существующих.
* Объем созданного объекта равен суме объемов исходных объектов, его масса равна сумме масс исходных объектов, а все три линейных размера одинаковые.
* */
public class MainClass {
    public static void main(String[] args) {
        Parallelepiped prl = new Parallelepiped();
        Parallelepiped pr2 = new Parallelepiped(2,4,6);

        System.out.println("Object 1 of superclass");
        System.out.println(prl.toString());
        System.out.println("Object 2 of superclass");
        System.out.println(pr2.toString());

        ParaWeight pw1 = new ParaWeight();
        pw1.setDepth(4);
        pw1.setHeight(8);
        pw1.setWidth(12);

        System.out.println("Object 1 of subclass");
        System.out.println(pw1.toString());

        ParaWeight pw2 = new ParaWeight(1,2,3,540);
        System.out.println("Object 2 of subclass");
        System.out.println(pw2.toString());

        pw2.decreaseMass(8);
        System.out.printf("mass after decrease = " + "%.3f", pw2.getMass());

        ParaWeight pw3 = pw1.newObjCreate(pw2,12);
        System.out.println(pw3.toString());
        System.out.println(pw3.getVolume(pw1,pw2));
    }
}
