package ProgUA.Java02OOP.classWork.pres03interfacesAndAbstract.MoreExtendingInterfaceDemo;

class MyClass implements Second{
    public void bravo(){ // Описание метода
        Second.super.bravo(); // Вызов версии метода из интерфейса Second
        System.out.println("Класс MyClass: метод bravo()");
    }
} // Главный класс:
