package ProgUA.Java02OOP.classWork.lesson06.ExtendingGenClassDemo;

// Подкласс на основе обобщенного класса с целочисленным
// типом вместо обобщенного:
class Alpha extends Base<Integer>{
    // Конструктор:
    Alpha(Integer n){
// Вызов конструктора суперкласса:
        super(n);
    } // Переопределение метода:
    void show(){
        System.out.print("Целочисленное поле: ");
// Вызов версии метода из суперкласса:
        super.show();
    }
} // Продолжение на следующем слайде!!!
