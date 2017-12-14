package ProgUA.Java02OOP.classWork.pres06lambda.demo03UsingLambdaDemo;

// Функциональный интерфейс:
interface MyNums{
    // Метод с кодом по умолчанию:
    default void show(int n){
        System.out.println("Аргумент: "+n);
        System.out.println("Результат: "+get(n));
    }
    // Абстрактный метод:
    int get(int n);
}
