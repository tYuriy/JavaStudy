package ProgUA.Java02OOP.classWork.pres04generics.UsingGenClassDemo;

class MyClass<X>{ // Обобщенный класс с одним параметром типа
    X data; // Поле обобщенного типа
    MyClass(X data){ // Конструктор с аргументом обобщенного типа
        this.data=data; // Присваивание значения полю
    }
    void show(){ // Метод для отображения значения поля
        System.out.println("Значение поля: "+data);
    }
} // Главный класс:
class UsingGenClassDemo{
    public static void main(String[] args){
// Создание объекта на основе обобщенного класса.
// Вместо обобщенного параметра используется идентификатор Integer:
        MyClass<Integer> A=new MyClass<Integer>(100);
// Создание объекта на основе обобщенного класса.
// Вместо обобщенного параметра используется идентификатор Character:
        MyClass<Character> B=new MyClass<Character>('B');
// Создание объекта на основе обобщенного класса.
// Вместо обобщенного параметра используется идентификатор String:
        MyClass<String> C=new MyClass<String>("Зеленый");
// Вызов метода show() из объектов обобщенного класса:
        A.show();
        B.show();
        C.show();
    }
}