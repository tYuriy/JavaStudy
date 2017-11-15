package ProgUA.Java01Start.homeWork.lesson05;

import java.util.Random;

public class HomeWork015 {
    public static void main(String[] args) {
        int n = 15;
        int [] nums = new int [n];
        Random rnd = new Random();

        //заполнение массива случайными числами
        for (int i=0;i<nums.length;i++){
            nums[i]= rnd.nextInt(100)+1;
            System.out.print(nums[i]+"\t");
        }
        System.out.println();

        int val=0;
        //сортировка по возрастанию
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if (nums[i]<nums[j]){
                    val=nums[i];
                    nums[i]=nums[j];
                    nums[j]=val;
                }
            }
        }

        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }

        System.out.println();
        //сортировка по убыванию
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    val=nums[i];
                    nums[i]=nums[j];
                    nums[j]=val;
                }
            }
        }

        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }

    }
}
