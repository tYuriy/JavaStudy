package ProgUA.Java02OOP.classWork.lesson07.GenTypeExtendingDemo;

class Alpha extends Base{
    int number; // Целочисленное поле
    Alpha(String txt,int n){ // Конструктор
        super(txt); // Вызов конструктора суперкласса
        number=n; // Присваивание значения целочисленному полю
    } // Переопределение метода:
    void show(){
        super.show(); // Вызов версии метода из суперкласса
// Отображение значения целочисленного поля:
        System.out.println("Целочисленное поле: "+number);
    }
} // Продолжение на следующем слайде!!!
