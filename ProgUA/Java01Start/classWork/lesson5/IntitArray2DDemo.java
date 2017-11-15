package ProgUA.Java01Start.classWork.lesson5;

public class IntitArray2DDemo {
    // Метод для отображения содержимого массива:
    static void show(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        // Массивы:
        int[][] A={{1,2,3},{4,5,6}};
        int[][] B={{1,2},{3,4},{5,6}};
        int[][] C={{1},{2,3},{4,5,6}};
        // Отображение содержимого массивов:
        System.out.println("Массив A:");
        show(A);
        System.out.println("Массив B:");
        show(B);
        System.out.println("Массив C:");
        show(C);
    }
}
