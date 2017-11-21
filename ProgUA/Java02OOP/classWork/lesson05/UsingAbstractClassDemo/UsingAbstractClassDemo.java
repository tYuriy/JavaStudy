package ProgUA.Java02OOP.classWork.lesson05.UsingAbstractClassDemo;

// Продолжение на следующем слайде!!!
// Главный класс:
class UsingAbstractClassDemo{
    // Главный метод:
    public static void main(String[] args){
// Создание объектов:
        Triangle T=new Triangle("красный",2); // Треугольник
        Square S=new Square("черный",3); // Квадрат
        Circle C=new Circle("желтый",1); // Круг
// Отображение информации об объектах через
// объектные переменные подклассов:
        System.out.println("Использование объектных переменных подкласса");
        T.show();
        S.show();
        C.show();
// Объектная переменная абстрактного суперкласса:
        ColoredFigure F;
// Отображение информации об объектах через
// объектную переменную абстрактного суперкласса:
        System.out.println("Использование объектной переменной абстрактного суперкласса");
        F=T; // Треугольник
        F.show();
        F=S; // Квадрат
        F.show();
        F=C; // Круг
        F.show();
    }
}