package ProgUA.Java02OOP.classWork.pres05exceptions.UsingMyExceptionDemo;

// Класс контролируемого исключения создается наследованием класса Exception:
class MyException extends Exception{
    private int code; // Закрытое числовое поле
    MyException(int n){ // Конструктор
        super();
        code=n;
    } // Переопределение метода toString():
    public String toString(){
        String txt="Исключение класса MyException\n";
        txt+="Код ошибки: "+code+"\n";
        txt+="------------------------------";
        return txt;
    }} // Класс неконтролируемого исключения создается
