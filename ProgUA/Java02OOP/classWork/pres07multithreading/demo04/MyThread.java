package ProgUA.Java02OOP.classWork.pres07multithreading.demo04;

class MyThread extends Thread{ // Подкласс класса Thread
    public void run(){ // Переопределение метода run()
        for(int i=1;i<=5;i++){
            System.out.println("Дочерний поток:\t"+i);
            try{
                Thread.sleep(4500);
            }
            catch(InterruptedException e){
                System.out.println("Прерывание дочернего потока");
            }}}} // Главный класс:
