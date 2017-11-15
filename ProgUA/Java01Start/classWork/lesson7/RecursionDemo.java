package Java01Start.classWork.lesson7;

public class RecursionDemo {
    // Метод для вычисления факториала числа:
    static int factorial(int n){
        if(n==1) return 1;
        else return n*factorial(n-1);
    }// Метод для вычисления чисел Фибоначчи:
    static int fibs(int n){
        if(n==1||n==2) return 1;
        else return fibs(n-1)+fibs(n-2);
    }// Метод для вычисления суммы квадратов чисел:
    static int sqrs(int n){
        if(n==0) return 0;
        else return n*n+sqrs(n-1);
    }
    // Метод для отображения содержимого массива:
    static void show(int[] a,int k){
        System.out.print(a[k]+" ");
        if(k==a.length-1){
            System.out.println();
        }
        else{
            show(a,k+1);
        }
    }
    // Перегрузка метода:
    static void show(int[] a){
        show(a,0);
    }
    // Главный метод:
    public static void main(String[] args){
        System.out.println("Факториал числа:");
        for(int k=1;k<=10;k++){
            System.out.println(k+"!="+factorial(k));
        }
        System.out.println("Числа Фибоначчи:");
        for(int k=1;k<=10;k++){
            System.out.print(fibs(k)+" ");
        }
        System.out.print("\nСумма квадратов от 1 до 10: ");
        System.out.println(sqrs(10));
// Числовой массив:
        int[] A={1,3,5,7,9,11,13,15,17,19,21};
// Отображение всех
// элементов массива:
        show(A);
// Отображение элементов,
// начиная с третьего:
        show(A,2);
    }
}
