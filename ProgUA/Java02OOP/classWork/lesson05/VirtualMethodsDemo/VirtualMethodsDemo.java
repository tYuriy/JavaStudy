package ProgUA.Java02OOP.classWork.lesson05.VirtualMethodsDemo;

class VirtualMethodsDemo{
    // Главный метод:
    public static void main(String[] args){
// Создание объекта суперкласса:
        Alpha objA=new Alpha("alpha");
// Отображение значения поля:
        objA.show();
// Создание объекта подкласса:
        Bravo objB=new Bravo("bravo");
// Отображение значения поля:
        objB.show();
    }
}