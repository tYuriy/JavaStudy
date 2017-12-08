package ProgUA.Java02OOP.classWork.presentation06.ObjMethReferenceDemo;

// Класс:
class MyClass{
    // Закрытое целочисленное поле:
    private int number;
    // Конструктор:
    MyClass(int n){
        number=n;
    }
    // Метод для присваивания значения полю:
    void set(int n){
        number=n;
    }
    // Метод для считывания значения поля:
    int get(){
        return number;
    }
}
