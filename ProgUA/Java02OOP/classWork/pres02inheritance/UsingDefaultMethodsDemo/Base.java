package ProgUA.Java02OOP.classWork.pres02inheritance.UsingDefaultMethodsDemo;

// Интерфейс с методом, имеющим код по умолчанию:
interface Base{
    // Метод с кодом по умолчанию:
    default void show(String txt){
        System.out.println("Интерфейс Base: "+txt);
    }
    // Объявление метода:
    void hello();
} // Класс реализует интерфейс Base:
