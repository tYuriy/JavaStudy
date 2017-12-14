package ProgUA.Java02OOP.classWork.pres01oop.lesson01;

// Описание класса:
class MyClass3{
    // Поля класса:
    int number;
    char symbol;
    // Конструктор класса без аргументов:
    MyClass3(){
// Присваивание значений полям:
        number=100;
        symbol='A';
    }
    // Конструктор класса с двумя аргументами:
    MyClass3(int n,char s){
// Присваивание значений полям:
        number=n;
        symbol=s;
    }
    // Метод для отображения значений полей объекта:
    void show(){
        System.out.println("Значения полей "+number+" и "+symbol);
    }
}
// Продолжение на следующем слайде!!!
// Описание класса с главным методом программы:
class UsingConstructorDemo{
    // Главный метод программы:
    public static void main(String[] args){
// Создание первого объекта
// (вызывается конструктор без аргументов):
        MyClass3 objA=new MyClass3();
// Создание второго объекта
// (вызывается конструктор с двумя аргументами):
        MyClass3 objB=new MyClass3(200,'B');
// Отображение значений полей первого объекта:
        System.out.println("Объект objA:");
        objA.show();
// Отображение значений полей второго объекта:
        System.out.println("Объект objB:");
        objB.show();
    }
}
