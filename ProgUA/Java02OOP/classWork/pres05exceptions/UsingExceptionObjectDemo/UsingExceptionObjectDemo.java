package ProgUA.Java02OOP.classWork.pres05exceptions.UsingExceptionObjectDemo;

class UsingExceptionObjectDemo{
    public static void main(String[] args){
        try{ // Код с ошибкой
            System.out.println("Отрицательный размер:");
            int[] a=new int[-1];
        } // Обработка ошибки:
        catch(NegativeArraySizeException e){
            System.out.println(e);
        } // Код с ошибкой:
        try{
            System.out.println("Неверный индекс:");
            int[] b={1};
            b[-1]=0;
        } // Обработка ошибки:
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } // Код с ошибкой:
        try{
            System.out.println("Деление на нуль:");
            int c=10/0;
        } // Обработка ошибки:
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}