package ProgUA.Java02OOP.classWork.pres07multithreading.demo06;

import java.util.Random; // Импорт класса Random

// Главный класс:
class MultiThreadDemo{
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Начинает выполняться главный поток");
// Создание объектов - запуск потоков:
        MyThread A=new MyThread("ALPHA",5);
        MyThread B=new MyThread("BRAVO",3);
        MyThread C=new MyThread("CHARLIE",7);
// Сообщения главного потока:
        for(int k=1;k<=4;k++){
            System.out.println("Сообщение от главного потока:\t"+k);
// Задержка в выполнении потока:
            Thread.sleep(2000);
        } // Ожидание завершения дочерних потоков:
        if(A.isAlive()){
            A.join();
        }
        if(B.isAlive()){
            B.join();
        }
        if(C.isAlive()){
            C.join();
        } // Сообщение о завершении главного потока:
        System.out.println("Главный поток завершен");
    }
}

//Конструктор класса Thread имеет несколько версий. В частности, можно
//вызывать конструктор класса Thread:
//● без аргументов - создается объект потока с параметрами по умолчанию;
//● с текстовым аргументом - такой аргумент задает название потока;
//● с аргументом, являющимся объектом класса, реализующим интерфейс
//Runnable - такой аргумент содержит метод run(), код которого
//выполняется в потоке;
//● можно передать первым аргументом объект с методом run(), а
//вторым - текстовое значение, определяющее название потока.
//Существуют и другие версии конструктора класса Thread.