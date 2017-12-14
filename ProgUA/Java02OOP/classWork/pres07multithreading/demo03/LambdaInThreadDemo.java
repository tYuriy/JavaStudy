package ProgUA.Java02OOP.classWork.pres07multithreading.demo03;

class LambdaInThreadDemo{
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Начинается выполнение программы");
// Интерфейсной переменной значением присваивается лямбда-выражение:
        Runnable r=()->{
            for(int i=1;i<=5;i++){
                System.out.println("Дочерний поток:\t"+i);
                try{
                    Thread.sleep(4500);
                }
                catch(InterruptedException e){
                    System.out.println("Прерывание дочернего потока");
                }
            }
        }; // Интерфейсная переменная - аргумент конструктора класса Thread:
        Thread t=new Thread(r);
        System.out.println("Запускается дочерний поток");
        t.start();
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
//Мы воспользовались тем обстоятельством, что интерфейс Runnable является
//функциональным. В интерфейсе Runnable имеется единственный абстрактный
//метод run(). Поэтому интерфейсной переменной типа Runnable можно
//присвоить значением лямбда-выражение, определяющее код метода, не имеющего
//аргументов и не возвращающего результат.