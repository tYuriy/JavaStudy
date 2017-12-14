package ProgUA.Java02OOP.classWork.pres04generics.UsingWildcardDemo;

// Обобщенный класс:
class MyClass<T>{
    // Поле обобщенного типа:
    T value;
    // Конструктор:
    MyClass(T val){
        value=val;
    }
}
