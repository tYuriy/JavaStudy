package ProgUA.Java02OOP.classWork.pres06lambda.demo09ConstructorReferenceDemo;

class ConstructorReferenceDemo{
    public static void main(String[] args){ // Главный метод
        MyInterface ref=MyClass::new; // Использование ссылки на конструктор
// Создание объекта вызовом метода из интерфейсной переменной:
        MyClass obj=ref.create(100);
// Вызов методов объекта:
        obj.show();
        obj.set(200);
        obj.show();
    }
}