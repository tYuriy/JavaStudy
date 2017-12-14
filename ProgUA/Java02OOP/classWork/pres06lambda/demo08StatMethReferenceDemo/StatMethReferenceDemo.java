package ProgUA.Java02OOP.classWork.pres06lambda.demo08StatMethReferenceDemo;

// Продолжение на следующем слайде!!!
// Главный класс:
class StatMethReferenceDemo{
    // Главный метод:
    public static void main(String[] args){
// Использование ссылок на статические методы:
        MyShow A=MyClass::show;
        MySum B=MyClass::sum;
        MyPrinter P=System.out::println;
// Вызов методов из интерфейсных переменных:
        A.myshow();
        P.myprint("Сумма чисел: "+B.mysum(10));
    }
}