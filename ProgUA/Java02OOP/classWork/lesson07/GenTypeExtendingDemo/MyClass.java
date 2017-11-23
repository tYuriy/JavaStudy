package ProgUA.Java02OOP.classWork.lesson07.GenTypeExtendingDemo;

// Продолжение на следующем слайде!!!
// Обобщенный класс:
class MyClass<X extends Base>{
    // Поле обобщенного типа:
    X obj;
    // Конструктор:
    MyClass(X obj){
// Значение поля:
        this.obj=obj;
    } // Метод обобщенного класса:
    void show(){
        System.out.println("Объект класса MyClass");
// Вызов метода из поля обобщенного типа:
        obj.show();
    }
} // Главный класс:
