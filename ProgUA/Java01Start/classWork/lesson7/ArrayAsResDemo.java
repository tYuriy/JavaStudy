package ProgUA.Java01Start.classWork.lesson7;

import java.util.Arrays;
import java.util.Random;

public class ArrayAsResDemo {
    // Метод для создания массива с числами Фибоначчи:
    static int[] fibs(int n){
        int[] nums=new int[n];
        nums[0]=1;
        if(nums.length==1) return nums;
        nums[1]=1;
        for(int k=2;k<nums.length;k++){
            nums[k]=nums[k-1]+nums[k-2];
        }
        return nums;
    }
    // Метод для создания массива со случайными символами:
    static char[] rands(int n){
        Random rnd=new Random();
        char[] symbs=new char[n];
        for(int k=0;k<symbs.length;k++){
            symbs[k]=(char)('A'+rnd.nextInt(26));
        }
        return symbs;
    }
    // Главный метод:
    public static void main(String[] args){
        int[] A; // Переменная для целочисленного массива
        char[] B; // Переменная для символьного массива
        A=fibs(10); // Создается массив с числами Фибоначчи
        System.out.println("Числа Фибоначчи:\n"+ Arrays.toString(A));
        B=rands(8); // Создается массив со случайными символами
        System.out.println("Случайные символы:\n"+Arrays.toString(B));
    }
}
