package ProgUA.Java02OOP.classWork.lesson06.ExtendingInterfaceDemo;

// Продолжение на следующем слайде!!! extends
// Интерфейс-наследник:
interface Second extends First{
    // Объявление метода:
    void bravo();
    // Метод с кодом по умолчанию:
    default void charlie(){
        System.out.println("Интерфейс Second: метод charlie()");
    }
    // Объявление метода:
    void echo();
}
