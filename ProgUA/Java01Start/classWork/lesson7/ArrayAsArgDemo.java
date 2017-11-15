package Java01Start.classWork.lesson7;

import java.util.Random;

public class ArrayAsArgDemo {
    static void fillArray(int[] nums){
        Random rnd=new Random();
        for(int k=0;k<nums.length;k++){
            nums[k]=rnd.nextInt(100)+1;
        }
    }
    // Метод для отображения массива:
    static void show(int[] nums){
        for(int k=0;k<nums.length;k++){
            System.out.print("| "+nums[k]+" ");
        }
        System.out.println("|");
    }
    // Главный метод:
    public static void main(String[] args){
// Массивы:
        int[] A={1,3,5,7,9,11,13,15};
        int[] B=new int[10];
        fillArray(B); // Массив B заполняется случайными числами
        System.out.println("Массив A:");
        show(A); // Отображается массив A
        System.out.println("Массив B:");
        show(B); // Отображается массив B
    }
}
