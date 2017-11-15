package ProgUA.Java02OOP.classWork.lesson05.SubclassConstructorDemo;

// Класс с главным методом программы:
class SubclassConstructorDemo{
    public static void main(String[] args){
// Объектная переменная подкласса:
        Bravo obj;
// Розные способы создания объекта подкласса:
        obj=new Bravo();
        obj=new Bravo("Красный");
        obj=new Bravo(100);
        obj=new Bravo("Зеленый",200);
        obj=new Bravo('Y');
        obj=new Bravo("Синий",300,'Z');
    }
}