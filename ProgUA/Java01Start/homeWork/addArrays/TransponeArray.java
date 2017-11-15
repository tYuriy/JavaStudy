package Java01Start.homeWork.addArrays;


import java.util.Random;

/*
Напишите программу, в которой создается двумерный целочисленный массив.
Массив заполняется случайными числами.
Затем в этом массиве строки и столбцы меняются местами:
первая строка становится первым столбцом, вторая строка становится вторым столбцом, и так далее.
Например, если исходный массив состоял из 3 строк и 5 столбцов,
то в итоге получаем массив из 5 строк и 3 столбцов.
 */
public class TransponeArray {
    public static void main(String[] args) {
        int maxVal=100;
        int n = 2;//rows
        int m = 6;//columns
        int [][] nums = new int [n][m];
        Random rnd = new Random ();
        //заполнение и вывод исходного массива
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums[0].length; j++){
                nums[i][j]=rnd.nextInt(maxVal)+1;
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        //заполнение и вывод траспонированного массива
        int [][] tNums = new int [m][n];
        for (int i=0; i<tNums.length; i++){
            for (int j=0; j<tNums[0].length; j++){
                tNums[i][j]=nums[j][i];
                System.out.print(tNums[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
