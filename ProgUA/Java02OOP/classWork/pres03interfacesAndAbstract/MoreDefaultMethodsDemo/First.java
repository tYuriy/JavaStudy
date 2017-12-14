package ProgUA.Java02OOP.classWork.pres03interfacesAndAbstract.MoreDefaultMethodsDemo;

// Первый интерфейс:
interface First{
    default void hello(){
        System.out.println("Метод из интерфейса First");
    }
} // Второй интерфейс:
