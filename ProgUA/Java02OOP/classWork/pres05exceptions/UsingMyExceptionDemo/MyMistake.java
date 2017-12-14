package ProgUA.Java02OOP.classWork.pres05exceptions.UsingMyExceptionDemo;

// наследованием класса RuntimeException:
class MyMistake extends RuntimeException{
    private int code; // Закрытое числовое поле
    MyMistake(int n){ // Конструктор
        super();
        code=n;
    } // Переопределение метода toString():
    public String toString(){
        String txt="Исключение класса MyMistake\n";
        txt+="Код ошибки: "+code+"\n";
        txt+="******************************";
        return txt;
    }} // Продолжение на следующем слайде!!!
