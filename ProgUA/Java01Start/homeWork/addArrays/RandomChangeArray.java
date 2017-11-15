package ProgUA.Java01Start.homeWork.addArrays;

import java.util.Random;

/*
Напишите программу, в которой создается и инициализируется двумерный числовой массив.
Затем из этого массива удаляется строка и столбец (создается новый массив,
в котором по сравнению с исходным удалена одна строка и один столбец).
Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.
 */
public class RandomChangeArray {
    public static void main(String[] args) {
        int n = 4;
        int m = 8;
        //int maxVal = 100;
        int[][] nums = new int[n][m];
        Random rnd = new Random ();
        int val = 1;
        //заполнение и вывод исходного массива
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums[0].length; j++){
                //nums[i][j]=rnd.nextInt(maxVal)+1;
                nums[i][j]=val;val++;
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        //случайная строка для удаления
        int delRow = rnd.nextInt(nums.length)+1;
        //случайный столбец для удаления
        int delCol = rnd.nextInt(nums[0].length)+1;

        System.out.println("\nИз массива удаляется строка " + delRow + " и столбец " +delCol + "\n");
        //новый массив с удаленной строкой и столбцом
        int rowCorr = 0;
        int colCorr = 0;
        int [][] newNums = new int [n-1][m-1];
        for (int i=0; i<newNums.length; i++){
            if (i == delRow-1){rowCorr=1;}
            for (int j=0; j<newNums[0].length; j++){
                if (j == delCol-1){colCorr=1;}
                newNums[i][j]=nums[i+rowCorr][j+colCorr];
                System.out.print(newNums[i][j]+"\t");
            }
            colCorr=0;
            System.out.println();
        }
    }
}
