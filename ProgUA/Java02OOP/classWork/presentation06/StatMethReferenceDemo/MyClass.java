package ProgUA.Java02OOP.classWork.presentation06.StatMethReferenceDemo;

// Класс со статическими методами:
class MyClass{
    // Методом отображается сообщение:
    static void show(){
        System.out.println("Метод класса MyClass");
    }
    // Методом вычисляется сумма чисел:
    static int sum(int n){
        int k,s=0;
        for(k=1;k<=n;k++){
            s+=k;
        }
        return s;
    }
} // Первый интерфейс:
