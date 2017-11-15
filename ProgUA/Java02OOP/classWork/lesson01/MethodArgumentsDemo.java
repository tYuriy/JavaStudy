package ProgUA.Java02OOP.classWork.lesson01;

class MethodArgumentsDemo{
    // Статический метод с двумя целочисленными аргументами,
// которые "обмениваются" значениями:
    static void swap(int a,int b){
        System.out.println("Выполняется метод swap()");
// Значения аргументов метода до
// изменения значений:
        System.out.println("Аргументы до изменения значений: "+a+" и "+b);
// Аргументы "обмениваются" значениями:
        int x=b;
        b=a;
        a=x;
// Значения аргументов метода после
// изменения значений:
        System.out.println("Аргументы после изменения значений: "+a+" и "+b);
                System.out.println("Завершено выполнение метода swap()");
    }
    // Продолжение на следующем слайде!!!
// Главный метод программы:
    public static void main(String[] args){
// Целочисленные переменные:
        int m=100,n=200;
// Значения переменных до вызова метода swap():
        System.out.println("Переменные до вызова метода swap(): "+m+" и "+n);
// Вызов метода swap():
                swap(m,n);
// Значения переменных после вызова метода swap():
        System.out.println("Переменные после вызова метода swap(): "+m+" и "+n);
    }
}