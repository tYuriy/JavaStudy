package ProgUA.Java02OOP.classWork.lesson05.OverrideMethodDemo;

// Главный класс:
class OverrideMethodDemo{
    // Главный метод:
    public static void main(String[] args){
// Создание объекта суперкласса:
        Alpha objA=new Alpha("objA");
// Создание объекта подкласса:
        Bravo objB=new Bravo("objB",123);
// Вызов метода из объекта суперкласса:
        objA.show();
// Вызов метода из объекта подкласса:
        objB.show();
    }
}