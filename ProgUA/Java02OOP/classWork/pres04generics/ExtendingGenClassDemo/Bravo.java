package ProgUA.Java02OOP.classWork.pres04generics.ExtendingGenClassDemo;

// Подкласс на основе обобщенного класса с текстовым типом вместо обобщенного:
class Bravo extends Base<String>{
    // Конструктор:
    Bravo(String txt){
// Вызов конструктора суперкласса:
        super(txt);
    } // Переопределение метода:
    void show(){
        System.out.print("Текстовое поле: ");
// Вызов версии метода из суперкласса:
        super.show();
    }
}
