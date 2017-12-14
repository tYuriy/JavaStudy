package ProgUA.Java02OOP.classWork.pres03interfacesAndAbstract.MoreDefaultMethodsDemo;

class MyClass implements First, Second{
    public void hello(){ // Описание метода
// Вызов версии метода из интерфейса First:
        First.super.hello();
// Вызов версии метода из интерфейса Second:
        Second.super.hello();
    }
} // Главный класс:
