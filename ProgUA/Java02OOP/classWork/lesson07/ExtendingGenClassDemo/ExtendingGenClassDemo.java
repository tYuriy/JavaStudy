package ProgUA.Java02OOP.classWork.lesson07.ExtendingGenClassDemo;

//: 123
//        Объект A: Alpha
//        Объект A: A
//        Объект B: 123
//        Объект B: Bravo
//        Объект B: B

// Главный класс:
class ExtendingGenClassDemo{
    // Главный метод:
    public static void main(String[] args){
// Создание объектов:
        Alpha A=new Alpha(123);
        Bravo B=new Bravo("объект B");
        Charlie C=new Charlie('C');
// Вызов метода show() из разных объектов:
        A.show();
        B.show();
        C.show();
    }
}