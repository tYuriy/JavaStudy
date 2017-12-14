package ProgUA.Java02OOP.classWork.pres07multithreading.demo02;

//Создание потока с использованием анонимного класса
class NewThreadDemo{
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Начинается выполнение программы");
// Аргументом конструктору передается анонимный объект анонимного класса:
        Thread t=new Thread(new Runnable(){
            public void run(){
                for(int i=1;i<=5;i++){
                    System.out.println("Дочерний поток:\t"+i);
                    try{
                        Thread.sleep(4500);
                    }
                    catch(InterruptedException e){
                        System.out.println("Прерывание дочернего потока");
                    }
                }
            }
        });
        System.out.println("Запускается дочерний поток");
        t.start();
        for(int k=0;k<=5;k++){
            System.out.println("Главный поток:\t"+(char)('A'+k));
            Thread.sleep(2000);
        } // Проверка дочернего потока:
        if(t.isAlive()){
            t.join(); // Ожидание завершения дочернего потока
        }
        System.out.println("Выполнение программы завершено");
    }
}
//Поскольку метод join() может выбрасывать контролируемое
//исключение класса InterruptedException, то инструкцию вызова
//метода join() следует размещать либо в try-блоке с
//предусмотренной возможностью перехвата и обработки исключения, либо
//метод, в котором вызывается метод join(), в описании должен
//содержать throws-инструкцию с названием класса
//InterruptedException. Используя такую инструкцию в описании
//метода main() мы решаем сразу две проблемы: можно не использовать
//обработку ошибки класса InterruptedException ни при вызове
//метода sleep(), ни при вызове метода join().