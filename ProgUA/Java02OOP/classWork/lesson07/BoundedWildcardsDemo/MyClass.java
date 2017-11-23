package ProgUA.Java02OOP.classWork.lesson07.BoundedWildcardsDemo;

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
