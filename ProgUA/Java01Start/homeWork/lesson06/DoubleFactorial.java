package ProgUA.Java01Start.homeWork.lesson06;

public class DoubleFactorial {
    //программа с методом для вычисления двойного факториала
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Двойной факториал числа " + n + " = " + calcFact(n));
    }

    static long calcFact (int a){
        long rez=1;
        for (int i=a;i>0;i=i-2){
            rez = rez*i;
        }
        return rez;
    }
}
