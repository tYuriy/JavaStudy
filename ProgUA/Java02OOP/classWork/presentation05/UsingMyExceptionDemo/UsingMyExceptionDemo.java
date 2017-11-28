package ProgUA.Java02OOP.classWork.presentation05.UsingMyExceptionDemo;

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
// Главный класс:
class UsingMyExceptionDemo{
    // Статический метод выбрасывает контролируемое
// исключение класса MyException:
    static void alpha(int n) throws MyException{
        throw new MyException(n);
    } // Статический метод выбрасывает неконтролируемое
    // исключение класса MyMistake:
    static void bravo(int n){
        throw new MyMistake(n);
    } // Главный метод:
    public static void main(String[] args){
        try{ // Контролируемый код (внешний блок)
            try{ // Контролируемый код (внутренний блок)
                alpha(123); // Метод выбрасывает исключение MyException
            } // Обработка исключения класса MyException:
            catch(MyException e){
                System.out.println(e);
                bravo(321);
            }
        } // Обработка исключения класса MyMistake:
        catch(MyMistake e){
            System.out.println(e);
        }
    }
}