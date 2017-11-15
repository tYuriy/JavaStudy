package Java01Start.homeWork.lesson06;

import java.util.Random;
import java.util.Arrays;

public class MaxFromArray {
    public static void main(String[] args) {
        //программа, метод которой возвращает наибольшее значение из переданных аргументами.
        //сначала создается массив и в методе заполняется случайными числами, затем в другом методе ищем максимальное значение
        int n = 25;//кол-во значений в массиве
        int m = 100;//максимальный размер значения
        int [] anArray = fillArray(n,m);
        System.out.println(Arrays.toString(anArray));
        System.out.println(getMax(anArray));
    }
    static int[] fillArray (int a, int b){
        int [] nums = new int [a];
        Random rnd = new Random();
        for (int i=0; i<a; i++){
            nums[i]=rnd.nextInt(b)+1;
        }
        return nums;
    }
    static int getMax (int [] arr){
        int max=arr[0];
        for (int i=1; i<arr.length; i++){
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }
}
