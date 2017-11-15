package ProgUA.Java02OOP.classWork.lesson05.OverrideMethodDemo;

class Bravo extends Alpha{ // Подкласс
    int code; // Целочисленное поле
    // Переопределение метода. Новой версией метода
// отображаются значения двух полей:
    void show(){
        System.out.println("Объект класса Bravo:");
        System.out.println("Поле name - "+name);
        System.out.println("Поле code - "+code);
    }
    // Конструктор класса:
    Bravo(String name,int code){
// Вызов конструктора суперкласса:
        super(name);
        this.code=code;
    }
} // Продолжение на следующем слайде!!!