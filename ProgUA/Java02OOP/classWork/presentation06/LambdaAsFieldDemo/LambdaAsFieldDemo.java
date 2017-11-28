package ProgUA.Java02OOP.classWork.presentation06.LambdaAsFieldDemo;

// Функциональный интерфейс:
interface MyInterface{
    // Метод с целочисленным аргументом возвращает
// целочисленный результат:
    int getNumber(int n);
}
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
// Главный класс:
class LambdaAsFieldDemo{
    // Главный метод:
    public static void main(String[] args){
// Создание объекта класса с передачей аргументом
// конструктору лямбда-выражения:
        MyClass obj=new MyClass((int n)->{return n*n;});
// Проверка результата:
        System.out.println("Аргумент:");
        for(int k=0;k<=5;k++){
            System.out.print(k+"\t");
        }
        System.out.println("\nАргумент в квадрате:");
        for(int k=0;k<=5;k++){
            System.out.print(obj.get(k)+"\t");
        }
// Полю объекта присваивается новое значение:
        obj.set((int n)->{return n*n*n;});
// Проверка результата:
        System.out.println("\nАргумент в кубе:");
        for(int k=0;k<=5;k++){
            System.out.print(obj.get(k)+"\t");
        }
        System.out.println("");
    }
}