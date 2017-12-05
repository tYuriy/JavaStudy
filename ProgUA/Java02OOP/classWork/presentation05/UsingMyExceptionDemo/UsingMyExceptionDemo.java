package ProgUA.Java02OOP.classWork.presentation05.UsingMyExceptionDemo;

// Главный класс:
class UsingMyExceptionDemo{
    // Статический метод выбрасывает контролируемое
// исключение класса MyException:
    static void alpha(int n) throws MyException{
        throw new MyException(n);
    } // Статический метод выбрасывает неконтролируемое
    // исключение класса MyMistake:
    static void bravo(int n) {
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