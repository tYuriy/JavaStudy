package ProgUA.Java02OOP.classWork.presentation06.OverloadedMethRefDemo;

// Класс:
class MyClass{
    // Поле:
    int number;
    // Перегруженный метод:
    void set(){
        number=0;
    }
    void set(int n){
        number=n;
    }
}
