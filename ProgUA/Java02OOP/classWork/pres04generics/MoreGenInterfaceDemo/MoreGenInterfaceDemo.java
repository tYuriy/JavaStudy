package ProgUA.Java02OOP.classWork.pres04generics.MoreGenInterfaceDemo;

// Продолжение на следующем слайде!!!
// Главный класс:
class MoreGenInterfaceDemo{
    // Главный метод:
    public static void main(String[] args){
// Интерфейсная переменная:
        MyMethods ref;
// Создание объектов:
        Alpha A=new Alpha(123);
        Bravo B=new Bravo('A');
// Вызов метода из объекта класса:
        A.show();
// Интерфейсной переменной присваивается значение:
        ref=A;
// Вызов метода через интерфейсную переменную:
        ref.set(321);
// Вызов методов из объектов класса:
        A.show();
        B.show();
// Интерфейсной переменной присваивается значение:
        ref=B;
// Вызов метода через интерфейсную переменную:
        ref.set('B');
// Вызов метода из объекта класса:
        B.show();
    }
}
