package ProgUA.addPresenentation.arrays;

import java.util.Scanner;
import java.util.Arrays;

/*
Задача 1:
1. Задать массив целых чисел длинной 10 эл.
2. Отсортировать числа в массиве
3. Вывести на экран результат.
4. Сделать возможность наполнения массива с клавиатуры*.
+
2. Поменять 1-й и последний элемент местами.

 */
public class CreateArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;//array size
        int [] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        printArr(arr);
        Arrays.sort(arr);
        printArr(arr);
        arr[0]=arr[0]+arr[arr.length-1];
        arr[arr.length-1]=arr[0]-arr[arr.length-1];
        arr[0]=arr[0]-arr[arr.length-1];
        printArr(arr);
    }
    static void printArr (int [] arr){
        for (int s: arr){
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}
