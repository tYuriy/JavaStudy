package ProgUA.Java02OOP.classWork.pres02inheritance.UsingAbstractClassDemo;

abstract class ColoredFigure{ // Абстрактный суперкласс
    String color; // Текстовое поле (цвет)
    int size; // Целочисленное поле (размер)
    ColoredFigure(String clr,int s){ // Конструктор
// Присваивание значений полям:
        color=clr;
        size=s;
    } // Метод для отображения информации об объекте:
    void show(){
// Цвет и название фигуры:
        System.out.println("Фигура: "+color+" "+getName());
// Характерный размер:
        System.out.println("Характерный размер ("+getSizeName()+"): "+size);
// Площадь:
        System.out.printf("Площадь: %.3f\n",getArea());
// Импровизированная "линия" из "звездочек":
        String line="";
        for(int k=1;k<=30;k++){
            line+="*";
        }
        System.out.println(line);
    } // Метод результатом возвращает название для
    // параметра, определяющего характерный размер фигуры:
    String getSizeName(){
        return "сторона";
    }
    // Абстрактные методы:
    abstract String getName(); // Название фигуры
    abstract double getArea(); // Площадь фигуры
} // Продолжение на следующем слайде!!!
