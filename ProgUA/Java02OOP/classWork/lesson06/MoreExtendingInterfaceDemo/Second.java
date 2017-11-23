package ProgUA.Java02OOP.classWork.lesson06.MoreExtendingInterfaceDemo;

interface Second extends First{
    default void alpha(){ // Описание методов
        First.super.alpha(); // Вызов версии метода из интерфейса First
        System.out.println("Интерфейс Second: метод alpha()");
    }
    default void bravo(){
        System.out.println("Интерфейс Second: метод bravo()");
    }
} // Класс реализует интерфейс:
