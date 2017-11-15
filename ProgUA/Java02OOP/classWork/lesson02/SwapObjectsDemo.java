package ProgUA.Java02OOP.classWork.lesson02;

class MyClass7{
    int number;
    MyClass7(int n){
        number=n;
    }
}
class SwapObjectsDemo{
    static void swap(MyClass7 A,MyClass7 B){
        System.out.println("Выполняется метод swap()");
        System.out.println("Объект A: "+A.number);
        System.out.println("Объект B: "+B.number);
// Аргументы "обмениваются" значениями:
        MyClass7 X=B;
        B=A;
        A=X;
        System.out.println("Значения аргументов изменены");
        System.out.println("Объект A: "+A.number);
        System.out.println("Объект B: "+B.number);
        System.out.println("Завершено выполнение метода swap()");
    }
    public static void main(String[] args){
        MyClass7 A=new MyClass7(100);
        MyClass7 B=new MyClass7(200);
        System.out.println("До вызова метода swap(): A.number="+A.number+" и B.number="+B.number);
                swap(A,B);
        System.out.println("После вызова метода swap(): A.number="+A.number+" и B.number="+B.number);
    }
}