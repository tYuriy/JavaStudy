package ProgUA.Java02OOP.classWork.pres07multithreading.demo08;

class MyThread extends Thread{
    private MyNumber obj; // Ссылка на объект с целочисленным полем
    private int time; // Интервал приостановки в выполнении потока
    private int count; // Количество циклов
    private boolean state; // Поле логического типа
    MyThread(String name,MyNumber obj,int time,int count,boolean state){
        super(name); // Вызов конструктора суперкласса
        this.obj=obj; // Ссылка на объект
        this.time=time; // Интервал задержки
        this.count=count; // Количество циклов
        this.state=state; // Значение поля логического типа
        start(); // Запуск потока
    } // Метод для отображения "линии" из символов:
    private void line(){
        char s; // Локальная символьная переменная
        if(state) s='-'; // Значение переменной
        else s='*';
        for(int k=1;k<=35;k++){ // Отображение последовательности символов
            System.out.print(s);
        }
        System.out.println("");
    }
    // Продолжение на следующем слайде!!!
// Переопределение метода run():
    public void run(){
        for(int k=1;k<=count;k++){ // Оператор цикла
            synchronized(obj){ // Блок синхронизации
                line(); // Отображается "линия"
// Отображение сообщения:
                System.out.println("Поток "+getName()+": исходное значение "+obj.number);
                try{ // Контролируемый код
                    Thread.sleep(time); // Задержка в выполнении потока
                } // Обработка исключения:
                catch(InterruptedException e){
                    System.out.println(e);
                } // Изменение значения поля объекта:
                if(state) obj.number++;
                else obj.number--;
// Отображение сообщения:
                System.out.println("Поток "+getName()+": новое значение "+obj.number);
                line(); // Отображение "линии"
            } // Завершение блока синхронизации
        }
    }
}
