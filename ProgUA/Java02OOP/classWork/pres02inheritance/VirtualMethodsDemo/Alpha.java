package ProgUA.Java02OOP.classWork.pres02inheritance.VirtualMethodsDemo;

// Суперкласс:
class Alpha{
    // Текстовое поле:
    String name;
    // Метод для отображения сообщения:
    void objectCreated(){
        System.out.println("Создан объект класса Alpha");
    }
    // Метод для отображения сообщения:
    void hello(){
        System.out.println("Объект класса Alpha");
    }
    // Метод для отображения значения поля:
    void show(){
// Вызов метода для отображения сообщения:
        hello();
// Отображение значения поля:
        System.out.println("Поле name: "+name);
    }
    // Конструктор:
    Alpha(String txt){
// Вызов метода для отображения сообщения:
        objectCreated();
// Присваивание значения полю:
        name=txt;
    }
}