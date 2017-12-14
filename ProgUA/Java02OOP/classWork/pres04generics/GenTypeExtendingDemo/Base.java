package ProgUA.Java02OOP.classWork.pres04generics.GenTypeExtendingDemo;

class Base{ // Суперкласс
    String name; // Текстовое поле
    Base(String txt){ // Конструктор
        name=txt;
    } // Метод для отображения значения поля:
    void show(){
        System.out.println("Текстовое поле: "+name);
    }
} // Подкласс суперкласса Base:
