package ProgUA.Java02OOP.classWork.pres04generics.BoundedWildcardsDemo;

// Обобщенный класс:
class MyClass<T>{
    // Закрытое поле обобщенного типа:
    private T obj;
    // Переопределение метода toString():
    public String toString(){
        return obj.toString();
    }
    // Конструктор:
    MyClass(T arg){
        obj=arg;
    }
}
