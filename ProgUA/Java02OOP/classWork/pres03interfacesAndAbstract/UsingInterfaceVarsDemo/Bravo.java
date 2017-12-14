package ProgUA.Java02OOP.classWork.pres03interfacesAndAbstract.UsingInterfaceVarsDemo;

// Класс реализует интерфейс Base:
class Bravo implements Base{
    // Целочисленное поле:
    int number;
    // Конструктор:
    Bravo(int n){
        number=n;
    }
    // Описание метода из интерфейса:
    public void show(){
        System.out.println("Объект класса Bravo");
        System.out.println("Целочисленное поле: "+number);
    }
} // Главный класс:
