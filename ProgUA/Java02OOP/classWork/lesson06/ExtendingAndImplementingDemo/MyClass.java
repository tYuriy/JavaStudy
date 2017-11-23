package ProgUA.Java02OOP.classWork.lesson06.ExtendingAndImplementingDemo;

// Подкласс наследует суперкласс и реализует интерфейсы:
class MyClass extends Base implements First, Second{
    public String getFirst(){ // Описание метода
        return "Интерфейс First";
    } // Описание метода:
    public String getSecond(){
        return "Интерфейс Second";
    } // Описание метода:
    public void show(){
        System.out.println("Мы используем:");
        System.out.println(getFirst());
        System.out.println(getSecond());
        System.out.println(getBase());
        First.super.show(); // Вызов версии метода из интерфейса First
        Second.super.show(); // Вызов версии метода из интерфейса Second
        super.show(); // Вызов версии метода из суперкласса Base
    }
} // Главный класс:
