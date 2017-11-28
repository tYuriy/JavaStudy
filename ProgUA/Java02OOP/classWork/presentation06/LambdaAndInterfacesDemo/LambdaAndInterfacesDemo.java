package ProgUA.Java02OOP.classWork.presentation06.LambdaAndInterfacesDemo;

// Первый функциональный интерфейс:
interface Alpha{
    void showA();
} // Второй функциональный интерфейс:
interface Bravo{
    void showB();
} // Третий функциональный интерфейс:
interface Charlie{
    void showC();
} // Главный класс:
class LambdaAndInterfacesDemo{
    public static void main(String[] args){ // Главный метод
// Значением интерфейсной переменной присваивается лямбда-выражение:
        Alpha A=()->System.out.println("Используем лямбда-выражение");
// Вызов метода из интерфейсной переменой:
        A.showA();
// Значением интерфейсной переменной присваивается лямбда-выражение:
        Bravo B=()->System.out.println("Используем лямбда-выражение");
// Вызов метода из интерфейсной переменой:
        B.showB();
// Значением интерфейсной переменной присваивается ссылка на метод:
        Charlie C=A::showA;
// Вызов метода из интерфейсной переменной:
        C.showC();
    }
}