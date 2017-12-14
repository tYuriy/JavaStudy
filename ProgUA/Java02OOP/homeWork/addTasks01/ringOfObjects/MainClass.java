package ProgUA.Java02OOP.homeWork.addTasks01.ringOfObjects;

/*8. Напишите программу, в которой создается "кольцо" из объектов:
"цепочка" объектов, в которой один объект ссылается на другой, а самый последний объект ссылается на первый.
Каждый объект имеет, кроме прочего, закрытое числовое поле со случайным значением,
и закрытое символьное поле тоже со случайным значением. Предложить методы для работы с таким "кольцом":
например, метод для отображения значений полей объектов, которые входят в "кольцо",
метод для удаления объекта из "кольца", и метод для добавления объекта в "кольцо".*/

public class MainClass {
    public static void main(String[] args) {
        int objCount=4;
        int count = objCount+2;
        RingPart rpFirst = new RingPart();
        RingPart rpNew = rpFirst;

        //заполненине кольца объектов
        for (int i = 0; i < objCount; i++) {
            rpNew.rpLink = new RingPart();
            rpNew=rpNew.rpLink;
        }
        rpNew.rpLink=rpFirst;

        //вывод кольца объекта в консоль
        System.out.println("Print objects with parameters: ");
        rpFirst.printRing(count);

        //добавление нового объекта
        System.out.println("\nAdd new object: ");
        RingPart rpX = new RingPart();
        rpX.addItem(rpNew);
        rpFirst.printRing(count);

        //удаление объекта по значению поля
        System.out.println("\nDelete object from ring of objects");
        rpFirst.delItem('B');
        rpFirst.printRing(count);
    }
}
