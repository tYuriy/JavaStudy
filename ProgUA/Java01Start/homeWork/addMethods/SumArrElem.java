package Java01Start.homeWork.addMethods;

import java.util.Random;

/*
Напишите программу со статическим методом, аргументом которому передается целочисленный массив,
а результатом возвращается среднее значение для элементов массива (сумма значений элементов,
деленная на количество элементов в массиве).
 */
public class SumArrElem {
    public static void main(String[] args) {
        int maxInputVal = 10;
        Random rnd = new Random();

        int arrSize = 3;
        int [] nums = new int[arrSize];

        //заполнение массива и вывод массива
        System.out.println("Сформированный массив из "+ arrSize + " элементов: ");
        for (int i=0; i<nums.length; i++){
            nums[i]=rnd.nextInt(maxInputVal)+1;
            System.out.print(nums[i]+"\t");
        }

        System.out.println("\n\nСреднее значение всех элементов массива = "+ findAvgVal(nums));
    }
    static double findAvgVal (int [] nums){
        double avgVal=0;
        for (int i=0; i<nums.length; i++){
            avgVal+=nums[i];
        }
        avgVal=avgVal/nums.length;
        return avgVal;
    }
}
