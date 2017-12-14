package ProgUA.Java02OOP.classWork.pres07multithreading.demo08;

// Продолжение на следующем слайде!!!
// Главный класс:
class SynchronizedThreadsDemo{
    // Главный метод:
    public static void main(String[] args){
// Целочисленные переменные:
        int n=100,count=5,time=1000,dt=200;
// Создание объекта с целочисленным полем:
        MyNumber obj=new MyNumber();
// Присваивание полю объекта значения:
        obj.number=n;
// Создание первого потока:
        MyThread Alpha=new MyThread("Alpha",obj,time+dt,count,true);
// Создание второго потока:
        MyThread Bravo=new MyThread("Bravo",obj,time-dt,count,false);
// Контролируемый код:
        try{
// Ожидание завершения потоков:
            if(Alpha.isAlive()) Alpha.join();
            if(Bravo.isAlive()) Bravo.join();
        } // Обработка исключения:
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}