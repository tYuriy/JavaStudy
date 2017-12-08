package ProgUA.Java02OOP.classWork.presentation06.OverloadedMethRefDemo2;

import java.util.AbstractList;

// Главный класс:
class OverloadedMethRefDemo{
    // Главный метод:
    public static void main(String[] args){
// Создание объекта:
        //MyClass obj=new MyClass();
// Использование ссылки на перегруженный метод:


//        Alpha A=MyClass::get;
//        Bravo B=MyClass::get;

        Alpha A=n -> ++n;
        Bravo B=n -> ++n;




        //Bravo B=obj::set;
// Вызов метода через интерфейсную переменную:
        //B.one(100);
// Проверка значения поля объекта:
        System.out.println(A.first(100));
        System.out.println(B.second('X'));
// Вызов метода через интерфейсную переменную:
       // A.none();
// Проверка значения поля объекта:
        //System.out.println("Значение поля: "+obj.number);
    }
}