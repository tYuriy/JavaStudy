package ProgUA.Java01Start.homeWork.lesson05;

public class HomeWork012 {
    public static void main(String[] args) {
        //создать одномерный массив и заполнить четными числами
        int n = 15;
        int nums[]= new int [n];

        for (int i=0;i<nums.length;i++){
            nums[i]=(i+1)*2;
            System.out.print(nums[i]+"\t");
        }
    }
}
