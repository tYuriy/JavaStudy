package ProgUA.Java02OOP.classWork.lesson07.MoreExtendingInterfaceDemo;

interface First{ // Первый интерфейс
    default void alpha(){ // Описание метода
        System.out.println("Интерфейс First: метод alpha()");
    }
} // Второй интерфейс:
