package ProgUA.Java02OOP.classWork.lesson05.UsingAbstractClassDemo;

// Подкласс (фигура - круг):
class Circle extends ColoredFigure{
    // Конструктор:
    Circle(String clr,int s){
// Вызов конструктора суперкласса:
        super(clr,s);
    }
    // Описание абстрактного метода из суперкласса,
// возвращающего результатом название фигуры:
    String getName(){
        return "круг";
    }
    // Описание абстрактного метода из суперкласса,
// возвращающего результатом площадь фигуры:
    double getArea(){
        double k=Math.PI;
        return size*size*k;
    }
    // Переопределение метода, возвращающего результатом
// название для параметра, определяющего характерный
// размер фигуры:
    String getSizeName(){
        return "радиус";
    }
}
