package ProgUA.Java02OOP.classWork.lesson06.UsingGenMethodsDemo;

// Класс с обобщенным методом:
class MyClass{
    String name; // Текстовое поле
    <X> void show(X arg){ // Обобщенный метод
        System.out.println(name+": "+arg);
    }
    MyClass(String txt){ // Конструктор
        name=txt;
    }
} // Главный класс:
