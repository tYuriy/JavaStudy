package ProgUA.Java01Start.homeWork.lesson05;

import java.util.Random;

public class HomeWork016 {
    public static void main(String[] args) {
        //поиск элемента массива с минимальным значением
        int n = 15;
        int [] nums = new int [n];
        Random rnd = new Random();

        //заполнение массива случайными числами
        for (int i=0;i<nums.length;i++){
            nums[i]= rnd.nextInt(100)+1;
            System.out.print(nums[i]+"\t");
        }

        System.out.println();

        int minVal=nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i] < minVal){
                minVal=nums[i];
            }
        }
        System.out.print("Minimal value is "+ minVal);
    }
}
