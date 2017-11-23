package ProgUA.Java02OOP.classWork.lesson07.ExtendingInterfaceDemo;

// Наследуемый интерфейс:
interface First{
    // Метод с кодом по умолчанию:
    default void alpha(){
        System.out.println("Интерфейс First: метод alpha()");
    }
    // Метод с кодом по умолчанию:
    default void bravo(){
        System.out.println("Интерфейс First: метод bravo()");
    }
    // Метод с кодом по умолчанию:
    default void charlie(){
        System.out.println("Интерфейс First: метод charlie()");
    }
    // Метод без кода по умолчанию:
    void delta();
}
