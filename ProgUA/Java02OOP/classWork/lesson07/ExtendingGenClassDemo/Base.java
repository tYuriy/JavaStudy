package ProgUA.Java02OOP.classWork.lesson07.ExtendingGenClassDemo;

// Обобщенный класс:
class Base<X>{
    // Обобщенное поле:
    X data;
    // Конструктор:
    Base(X data){
        this.data=data;
    } // Метод для отображения значения поля:
    void show(){
        System.out.println(data);
    }
}
