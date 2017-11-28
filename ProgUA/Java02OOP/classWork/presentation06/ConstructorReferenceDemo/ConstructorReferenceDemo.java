package ProgUA.Java02OOP.classWork.presentation06.ConstructorReferenceDemo;

class MyClass{ // Класс
    private int number; // Закрытое поле
    MyClass(int n){ // Конструктор
        number=n;
    } // Открытые методы:
    void show(){
        System.out.println("Значение поля: "+number);
    }
    void set(int n){
        number=n;
    }
} // Интерфейс:
interface MyInterface{
    MyClass create(int n);
} // Главный класс:
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