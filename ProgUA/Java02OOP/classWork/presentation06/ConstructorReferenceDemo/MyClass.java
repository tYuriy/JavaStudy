package ProgUA.Java02OOP.classWork.presentation06.ConstructorReferenceDemo;

class MyClass{ // Класс
    private int number; // Закрытое поле
    MyClass(int n){ // Конструктор
        number=n;
    } // Открытые методы:
    void show(){
        System.out.println("Значение поля: "+number);
    }
    void set(int n){
        number=n;
    }
} // Интерфейс:
