package Java01Start.classWork.lesson7;

public class StatMethodDemo {
    // Метод для отображения текста:
    static void show(String txt){
        System.out.println(txt);
    }
    // Метод для вычисления факториала числа:
    static int factorial(int n){
        int s=1;
        for(int k=1;k<=n;k++){
            s*=k;
        }
        return s;
    }
    // Метод для возведения числа в степень:
    static double power(double x,int n){
        double s=1;
        for(int k=1;k<=n;k++){
            s*=x;
        }
        return s;
    }
    // Главный метод:
    public static void main(String[] args){
// Вызываем методы:
        show("Начинаем вычисления:");
        int m=5;
        double z=3,p;
        show(m+"!="+factorial(m));
        p=power(z,m);
        show(z+" в степени "+m+": "+p);
    }
}