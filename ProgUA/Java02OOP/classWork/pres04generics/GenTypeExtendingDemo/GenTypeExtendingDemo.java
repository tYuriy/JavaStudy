package ProgUA.Java02OOP.classWork.pres04generics.GenTypeExtendingDemo;

class GenTypeExtendingDemo{
    // Главный метод:
    public static void main(String[] args){
// Объекты создаются на основе обобщенного класса:
        MyClass<Alpha> A=new MyClass<>(new Alpha("Alpha",123));
        MyClass<Bravo> B=new MyClass<>(new Bravo("Bravo",321,'B'));
// Вызов метода show() из объектов:
        A.show();
        B.show();
    }
}