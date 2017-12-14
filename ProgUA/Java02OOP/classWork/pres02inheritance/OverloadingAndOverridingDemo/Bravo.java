package ProgUA.Java02OOP.classWork.pres02inheritance.OverloadingAndOverridingDemo;

// Подкласс:
class Bravo extends Alpha{
    void show(){ // Переопределение версии метода без аргументов
        System.out.println("Класс Bravo");
    }
    void show(int num){ // Версия метода с целочисленным аргументом
        System.out.println("Число "+num);
    }
}