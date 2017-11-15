package ProgUA.Java01Start.classWork.lesson6;

public class StrangeArrayDemo {
    public static void main(String[] args){
    // Массив с размерами строк:
        int[] n={2,5,3,4,14};
        int val=1;
        // Массив строк:
        int[][] A=new int[n.length][];
        // Создание строк и их заполнение:
        for(int i=0;i<A.length;i++){
            // Создание новой строки:
            A[i]=new int[n[i]];
            // Заполнение строки:
            for(int j=0;j<A[i].length;j++){
                A[i][j]=val++;
                // Отображение значения элемента:
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
