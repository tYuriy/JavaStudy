package ProgUA.Java02OOP.classWork.pres07multithreading.demo01;

// Продолжение на следующем слайде!!!
// Главный класс:
class CreatingThreadDemo{
    // Главный поток:
    public static void main(String[] args){
        System.out.println("Начинается выполнение программы");
// Создание объекта класса Thread для запуска
// дочернего потока на выполнение:
        Thread t=new Thread(new MyThread());
        System.out.println("Запускается дочерний поток");
// Запуск дочернего потока:
        t.start();
        for(int k=0;k<=5;k++){
// Отображение сообщения:
            System.out.println("Главный поток:\t"+(char)('A'+k));
            try{
// Задержка в выполнении главного потока:
                Thread.sleep(2000);
            } // Обработка исключения:
            catch(InterruptedException e){
                System.out.println("Прерывание главного потока");
            }
        }
        System.out.println("Выполнение программы завершено");
    }
}