package ProgUA.Java02OOP.classWork.pres07multithreading.demo01;

// Класс реализует интерфейс Runnable:
class MyThread implements Runnable{
    // Описание метода run() (программный код для потока):
    public void run(){
        for(int i=1;i<=5;i++){
// Отображение сообщения:
            System.out.println("Дочерний поток:\t"+i);
            try{
// Задержка в выполнении потока:
                Thread.sleep(1200);
            }
// Обработка исключения:
            catch(InterruptedException e){
                System.out.println("Прерывание дочернего потока");
            }
        }
    }
}
