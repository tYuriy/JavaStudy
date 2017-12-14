package ProgUA.Java02OOP.classWork.pres07multithreading.demo04;

class ExtendingThreadDemo{
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Начинается выполнение программы");
        MyThread t=new MyThread(); // Создание объекта класса MyThread
        System.out.println("Запускается дочерний поток");
        t.start(); // Запуск дочернего потока
        for(int k=0;k<=5;k++){
            System.out.println("Главный поток:\t"+(char)('A'+k));
            Thread.sleep(2000);
        }
        if(t.isAlive()){
            t.join();
        }
        System.out.println("Выполнение программы завершено");
    }
}