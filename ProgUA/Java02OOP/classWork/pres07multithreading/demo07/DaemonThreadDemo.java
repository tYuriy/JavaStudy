package ProgUA.Java02OOP.classWork.pres07multithreading.demo07;

// Статический импорт:
import static javax.swing.JOptionPane.*;
class DaemonThreadDemo{
    public static void main(String[] args) throws InterruptedException{
// Создание объекта для дочернего потока. Первый
// аргумент конструктора является лямбда-выражением,
// второй аргумент - название потока:
        Thread t=new Thread(()->{
// Индексная переменная и
// переменная для записи суммы чисел:
            int k=1,s=0;
// Бесконечный цикл для вычисления суммы:
            while(true){
// Отображение сообщения:
                System.out.println(Thread.currentThread().getName()+": "+s);
                try{
// Задержка в выполнении потока:
                    Thread.sleep(1000);
                } // Обработка исключения:
                catch(InterruptedException e){}
// Прибавление слагаемого к сумме:
                s+=k;
// Увеличение значения индексной переменной:
                k++;
            }
        },"Вычисление суммы"); // Продолжение на следующем слайде!!!
// Статус демон-потока:
        t.setDaemon(true);
// Переменная для записи результат
// выбора пользователя (нажатая кнопка):
        int res;
// Запуск потока на выполнение:
        t.start();
// Отображение диалогового окна:
        do{
// Задержка в выполнении потока:
            Thread.sleep(3000);
// Отображение окна и запоминание
// выбора пользователя:
            res=showConfirmDialog(null,
// Текст в окне:
                    "Закончить вычисление суммы?",
// Название окна:
                    "Сумма чисел",
// Кнопки в окне:
                    YES_NO_OPTION);
        }while(res!=YES_OPTION);
    }
}

//Могут использоваться такие константы для определения кнопок, отображаемых в
//диалоговом окне: DEFAULT_OPTION (по умолчанию отображается кнопка OK),
//YES_NO_OPTION (отображаются кнопки Yes и No), YES_NO_CANCEL_OPTION
//(отображаются кнопки Yes, No и Cancel) и OK_CANCEL_OPTION (отображаются
//кнопки OK и Cancel).

//Константы, определяющие результат метода showConfirmDialog(), такие:
//YES_OPTION (нажата кнопка Yes), NO_OPTION (нажата кнопка No),
//CANCEL_OPTION (нажата кнопка Cancel), OK_OPTION (нажата кнопка OK) и
//CLOSED_OPTION (окно закрыто щелчком на системной пиктограмме).