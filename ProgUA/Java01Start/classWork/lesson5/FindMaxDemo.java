package Java01Start.classWork.lesson5;

import java.util.Random;

public class FindMaxDemo {
    public static void main(String[] args){
        int k,val;
        // Объект для генерирования случайных чисел:
        Random rnd=new Random();
        // Создание массива:
        int[] nums=new int[12];
        // Заполнение и отображение массива:
        for(k=0;k<nums.length;k++){
            // Присваивание значения элементу массива:
            nums[k]=rnd.nextInt(100)+1;
            // Отображение значения элемента массива:
             System.out.print(nums[k]+" ");
        }
        System.out.print("\nMax value is ");
        // Поиск наибольшего значения:
        val=nums[0];
        for(k=1;k<nums.length;k++){
            if(nums[k]>val) val=nums[k];
        }
        System.out.println(val);
    }
}

