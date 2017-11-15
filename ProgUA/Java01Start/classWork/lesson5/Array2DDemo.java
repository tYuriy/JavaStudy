package ProgUA.Java01Start.classWork.lesson5;

public class Array2DDemo {
    public static void main(String[] args){
        int m=2,n=4,i,j;
        // Двумерные массивы:
        int[][] a=new int[3][5];
        char[][] b;
        b=new char[m][n];
        int val=1;
        char s='A';
        // Заполнение и отображение массивов:
        System.out.println("Числовой массив:");
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                a[i][j]=val; // Значение элемента массива
                val++; // Значение для следующего элемента
                System.out.print(a[i][j]+"\t"); // Отображение элемента
            }
            System.out.println();
        }
        System.out.println("Символьный массив:");
        for(i=0;i<b.length;i++){
            for(j=0;j<b[i].length;j++){
                b[i][j]=s; // Значение элемента массива
                s++; // Значение для следующего элемента
                System.out.print(b[i][j]+" "); // Отображение элемента
            }
            System.out.println();
        }
    }
}
