package ProgUA.Java02OOP.classWork.pres06lambda.demo02MoreAnonymousClassDemo;

// Интерфейс:
interface Base{
    // Метод с кодом по умолчанию:
    default void show(){
        System.out.println("Интерфейс Base");
    }
    // Объявление метода:
    void hello();
}
