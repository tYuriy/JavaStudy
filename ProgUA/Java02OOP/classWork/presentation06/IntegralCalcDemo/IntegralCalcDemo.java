package ProgUA.Java02OOP.classWork.presentation06.IntegralCalcDemo;

interface MyFunction{ // Функциональный интерфейс
    // Метод с double-аргументом и double-результатом:
    double f(double x);
} // Главный класс:
class IntegralCalcDemo{ // Статический метод для вычисления интеграла:
    static double integrate(MyFunction obj,double a,double b){
        int n=1000; // Количество внутренних интервалов
        double h=(b-a)/n; // Длина внутреннего интервала
        double s=(obj.f(a)+obj.f(b))*h/2;// Переменная для записи интегральной суммы
        for(int k=1;k<=n-1;k++){ // Вычисление интегральной суммы
            s+=h*obj.f(a+k*h);
        } // Результат метода - значение интеграла:
        return s;
    } // Главный метод:
    public static void main(String[] args){ // Вычисление интеграла:
        System.out.print(integrate((double x)->{return x*(1-x);},0,1));
        System.out.println(" - точное значение "+1.0/6); // Значение для сравнения
// Вычисление интеграла:
        System.out.print(integrate((double x)->{return 1/x;},1,2));
// Значение для сравнения:
        System.out.println(" - точное значение "+Math.log(2));
// Вычисление интеграла:
        System.out.print(integrate((double x)->{return Math.exp(-x);},0,10));
// Значение для сравнения:
        System.out.println(" - точное значение "+(1-Math.exp(-10)));}}