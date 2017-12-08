package ProgUA.Java02OOP.classWork.presentation06.UsingAnonymousClassDemo;

interface MyNums{ // Интерфейс
    default void show(int n){
        System.out.println("Аргумент: "+n);
        System.out.println("Результат: "+get(n));
    }
    int get(int n);
}
