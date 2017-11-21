package ProgUA.Java02OOP.classWork.lesson05.UsingInterfacesDemo;

class MyClass implements First, Second{
    // Описание метода из первого интерфейса:
    public void hello(){
        System.out.println("Метод из интерфейса First");
    }
    // Описание метода из второго интерфейса:
    public void hi(){
        System.out.println("Метод из интерфейса Second");
    }
} // Главный класс:
