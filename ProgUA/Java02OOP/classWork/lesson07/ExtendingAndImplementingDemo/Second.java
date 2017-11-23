package ProgUA.Java02OOP.classWork.lesson07.ExtendingAndImplementingDemo;

interface Second{
    String getSecond(); // Объявление метода
    default void show(){ // Описание метода
        System.out.println("Интерфейс Second: метод show()");
    }
} // Суперкласс:
