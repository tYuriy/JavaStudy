package ProgUA.Java02OOP.classWork.lesson06.UsingGenMethodsDemo;

class UsingGenMethodsDemo{
    public static void main(String[] args){ // Главный метод
        MyClass A=new MyClass("Объект A"); // Создание объектов
        MyClass B=new MyClass("Объект B");
        A.show(123); // Вызов обобщенных методов из разных объектов
        A.show("Alpha");
        A.show('A');
        B.show(1213);
        B.show("Bravo");
        B.show('B');
    }
}