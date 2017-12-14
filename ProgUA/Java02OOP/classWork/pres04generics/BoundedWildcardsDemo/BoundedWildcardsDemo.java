package ProgUA.Java02OOP.classWork.pres04generics.BoundedWildcardsDemo;

// Продолжение на следующем слайде!!!
class BoundedWildcardsDemo{ // Главный класс
    // Статический метод для отображения текстового представления объекта,
// созданного с использованием подкласса для класса Charlie:
    static void show(MyClass<? extends Charlie> obj){
        System.out.println(obj);
    } // Статический метод для отображения текстового представления объекта,
    // созданного с использованием суперкласса для класса Charlie:
    static void display(MyClass<? super Charlie> obj){
        System.out.println(obj);
    } // Главный метод:
    public static void main(String[] args){// Создание объектов:
        MyClass<Alpha> A=new MyClass<>(new Alpha("Объект A"));
        MyClass<Bravo> B=new MyClass<>(new Bravo("Объект B"));
        MyClass<Charlie> C=new MyClass<>(new Charlie("Объект C"));
        MyClass<Delta> D=new MyClass<>(new Delta("Объект D"));
        MyClass<Echo> E=new MyClass<>(new Echo("Объект E"));
// Вызов методов display() и show() с передачей
// аргументом одного из созданных объектов:
        display(A);
        display(B);
        display(C);
        show(C);
        show(D);
        show(E);
    }
}