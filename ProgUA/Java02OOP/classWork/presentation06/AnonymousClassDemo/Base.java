package ProgUA.Java02OOP.classWork.presentation06.AnonymousClassDemo;

// Абстрактный суперкласс:
abstract class Base{
    // Текстовое поле:
    private String name;
    // Конструктор:
    Base(String txt){
        name=txt;
    }
    // Метод для отображения значения текстового поля:
    void show(){
        System.out.println("Имя объекта: "+name);
    }
    // Объявление абстрактного метода:
    abstract void hello();
} // Главный класс:
