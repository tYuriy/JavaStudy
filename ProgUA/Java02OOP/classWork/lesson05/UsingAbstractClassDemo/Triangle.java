package ProgUA.Java02OOP.classWork.lesson05.UsingAbstractClassDemo;

class Triangle extends ColoredFigure{ // Подкласс (фигура - треугольник)
    Triangle(String clr,int s){ // Конструктор
        super(clr,s); // Вызов конструктора суперкласса
    }
    // Описание абстрактного метода из суперкласса, возвращающего название фигуры:
    String getName(){
        return "треугольник";
    }
    // Описание абстрактного метода из суперкласса, возвращающего площадь фигуры:
    double getArea(){
        double k=Math.sqrt(3)/4;
        return size*size*k;
    }
}
