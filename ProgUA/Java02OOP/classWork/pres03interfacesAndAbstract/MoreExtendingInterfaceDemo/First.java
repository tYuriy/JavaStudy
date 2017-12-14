package ProgUA.Java02OOP.classWork.pres03interfacesAndAbstract.MoreExtendingInterfaceDemo;

interface First{ // Первый интерфейс
    default void alpha(){ // Описание метода
        System.out.println("Интерфейс First: метод alpha()");
    }
} // Второй интерфейс:
