package ProgUA.Java02OOP.classWork.pres03interfacesAndAbstract.ExtendingAndImplementingDemo;

interface Second{
    String getSecond(); // Объявление метода
    default void show(){ // Описание метода
        System.out.println("Интерфейс Second: метод show()");
    }
} // Суперкласс:
