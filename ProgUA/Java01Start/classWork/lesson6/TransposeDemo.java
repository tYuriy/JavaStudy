package ProgUA.Java01Start.classWork.lesson6;

public class TransposeDemo {
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
    // Массив (матрица):
        int[][] A={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int i,j,n;
        System.out.println("До транспонирования:");
        show(A);
        // Транспонирование:
        for(i=1;i<A.length;i++){
            for(j=0;j<i;j++){
                n=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=n;
            }
        }
        System.out.println("После транспонирования:");
        show(A);
    }
}
