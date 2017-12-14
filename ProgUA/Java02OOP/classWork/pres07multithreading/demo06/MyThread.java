package ProgUA.Java02OOP.classWork.pres07multithreading.demo06;

import java.util.Random;

// Подкласс MyThread создается наследованием суперкласса Thread:
class MyThread extends Thread{
    private int count; // Количество сообщений
    MyThread(String name,int count){ // Конструктор
        super(name); // Вызов конструктора суперкласса
        this.count=count; // Значение целочисленного поля
        start(); // Запуск потока на выполнение
    } // Переопределение метода run():
    public void run(){ // Отображение сообщения о запуске потока:
        System.out.println("Выполняется поток "+getName());
// Создание объекта класса Random для генерирования случайных чисел:
        Random rnd=new Random();
// Оператор цикла, в котором выводятся сообщения:
        for(int k=1;k<=count;k++){
            System.out.println("Сообщение от потока "+getName()+":\t"+getName().charAt(0)+k);
            try{ // Задержка в выполнении потока:
                Thread.sleep(1000+rnd.nextInt(2001));
            }
            catch(InterruptedException e){
                System.out.println("Прерывание потока "+getName());
            }
        } // Сообщение о завершении выполнения потока:
        System.out.println("Поток "+getName()+" завершен");
    }
} // Продолжение на следующем слайде!!!
