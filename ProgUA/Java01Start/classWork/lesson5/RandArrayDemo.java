package Java01Start.classWork.lesson5;

import java.util.Random;

public class RandArrayDemo {
    public static void main(String[] args){
        // Объект для генерирования случайных чисел:
        Random rnd=new Random();
        // Размер массива:
        int n=5;
        // Создание массива:
        int[] nums=new int[n];
        // Заполнение и отображение массива:
        for(int k=0;k<nums.length;k++){
            // Присваивание значения элементу массива:
            nums[k]=rnd.nextInt(5)+1;
            // Отображение значения элемента массива:
            System.out.print(nums[k]+" ");
        }
        System.out.println("");
        // Отображение массива в обратном порядке:
        for(int k=nums.length-1;k>=0;k--){
            System.out.print(nums[k]+" ");
        }
        System.out.println("");
    }
}
