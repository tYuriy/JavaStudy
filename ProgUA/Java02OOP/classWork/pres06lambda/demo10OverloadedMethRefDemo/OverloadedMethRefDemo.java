package ProgUA.Java02OOP.classWork.pres06lambda.demo10OverloadedMethRefDemo;

// Главный класс:
class OverloadedMethRefDemo{
    // Главный метод:
    public static void main(String[] args){
// Создание объекта:
        MyClass obj=new MyClass();
// Использование ссылки на перегруженный метод:
        Alpha A=obj::set;
        Bravo B=obj::set;
// Вызов метода через интерфейсную переменную:
        B.one(100);
// Проверка значения поля объекта:
        System.out.println("Значение поля: "+obj.number);
// Вызов метода через интерфейсную переменную:
        A.none();
// Проверка значения поля объекта:
        System.out.println("Значение поля: "+obj.number);
    }
}