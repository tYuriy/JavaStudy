package Java01Start.homeWork.lesson06;

public class Factorial {
    public static void main(String[] args) {
        //программа с методом для вычисления факториала
        int n = 6;
        System.out.println(calcFact(n));
    }

    static int calcFact (int a){
        int rez=1;
        for (int i=1;i<=a;i++){
            rez *= i;
        }
        return rez;
    }
}

