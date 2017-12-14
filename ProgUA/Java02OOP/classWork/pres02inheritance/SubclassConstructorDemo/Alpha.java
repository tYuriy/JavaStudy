package ProgUA.Java02OOP.classWork.pres02inheritance.SubclassConstructorDemo;

// Суперкласс:
class Alpha{
    String name; // Текстовое поле
    int code; // Целочисленное поле
    // Конструктор с аргументами:
    Alpha(String name,int code){
        this.name=name;
        this.code=code;
        System.out.println("Класс Alpha:");
        System.out.println("Поле name - "+this.name);
        System.out.println("Поле code - "+this.code);
    }
    // Конструктор с одним текстовым аргументом:
    Alpha(String name){
// Вызов конструктора с двумя аргументами:
        this(name,0);
    }
    // Конструктор с одним целочисленным аргументом:
    Alpha(int code){
// Вызов конструктора с двумя аргументами:
        this("Белый",code);
    } // Продолжение на следующем слайде!!!
    // Конструктор без аргументов:
    Alpha(){
        this("Желтый",1);
    }
}