package ProgUA.Java02OOP.classWork.lesson06.MoreExtendingInterfaceDemo;

class MyClass implements Second{
    public void bravo(){ // Описание метода
        Second.super.bravo(); // Вызов версии метода из интерфейса Second
        System.out.println("Класс MyClass: метод bravo()");
    }
} // Главный класс:
