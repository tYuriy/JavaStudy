package ProgUA.Java02OOP.classWork.pres06lambda.demo13LambdaAsFieldDemo;

// Класс с полем интерфейсного типа:
class MyClass{
    // Закрытое поле интерфейсного типа:
    private MyInterface ref;
    // Конструктор:
    MyClass(MyInterface mi){
        set(mi);
    }
    // Метод для присваивания значения полю:
    void set(MyInterface mi){
        ref=mi;
    }
    // Метод с целочисленным аргументом возвращает
// результатом целое число:
    int get(int n){
// Вызов метода из объекта, на которое ссылается
// поле интерфейсного типа:
        return ref.getNumber(n);
    }
} // Продолжение на следующем слайде!!!
