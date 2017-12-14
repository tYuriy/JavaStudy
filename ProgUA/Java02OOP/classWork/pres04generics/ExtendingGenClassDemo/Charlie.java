package ProgUA.Java02OOP.classWork.pres04generics.ExtendingGenClassDemo;

// Подкласс на основе обобщенного класса с символьным типом вместо обобщенного:
class Charlie extends Base<Character>{
    // Конструктор:
    Charlie(Character s){
// Вызов конструктора суперкласса:
        super(s);
    } // Переопределение метода:
    void show(){
        System.out.print("Символьное поле: ");
// Вызов версии метода из суперкласса:
        super.show();
    }
} // Продолжение на следующем слайде!!!
