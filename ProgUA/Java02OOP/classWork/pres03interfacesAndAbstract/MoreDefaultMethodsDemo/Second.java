package ProgUA.Java02OOP.classWork.pres03interfacesAndAbstract.MoreDefaultMethodsDemo;

interface Second{
    default void hello(){
        System.out.println("Метод из интерфейса Second");
    }
} // Класс реализует два интерфейса:
