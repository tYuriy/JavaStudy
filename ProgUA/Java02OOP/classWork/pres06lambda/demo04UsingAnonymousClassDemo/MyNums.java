package ProgUA.Java02OOP.classWork.pres06lambda.demo04UsingAnonymousClassDemo;

interface MyNums{ // Интерфейс
    default void show(int n){
        System.out.println("Аргумент: "+n);
        System.out.println("Результат: "+get(n));
    }
    int get(int n);
}
