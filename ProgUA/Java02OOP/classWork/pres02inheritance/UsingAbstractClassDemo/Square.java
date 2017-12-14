package ProgUA.Java02OOP.classWork.pres02inheritance.UsingAbstractClassDemo;

class Square extends ColoredFigure{ // Подкласс (фигура - квадрат)
    Square(String clr,int s){ // Конструктор
        super(clr,s); // Вызов конструктора суперкласса
    }
    // Описание абстрактного метода из суперкласса,
// возвращающего результатом название фигуры:
    String getName(){
        return "квадрат";
    }
    // Описание абстрактного метода из суперкласса,
// возвращающего результатом площадь фигуры:
    double getArea(){
        double k=1;
        return size*size*k;
    }
} // Продолжение на следующем слайде!!!
