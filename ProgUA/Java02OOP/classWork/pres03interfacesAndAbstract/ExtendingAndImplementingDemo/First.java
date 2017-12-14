package ProgUA.Java02OOP.classWork.pres03interfacesAndAbstract.ExtendingAndImplementingDemo;

// Первый интерфейс:
interface First{
    String getFirst(); // Объявление метода
    default void show(){ // Описание метода
        System.out.println("Интерфейс First: метод show()");
    }
} // Второй интерфейс:
