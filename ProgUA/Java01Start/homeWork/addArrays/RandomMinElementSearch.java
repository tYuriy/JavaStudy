package Java01Start.homeWork.addArrays;

import java.util.Random;

/*
Напишите программу, в которой создается массив и заполняется случайными числами.
Массив отображается в консольном окне.
В этом массиве необходимо определить элемент с минимальным значением.
В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.
 */
public class RandomMinElementSearch {
    public static void main(String[] args) {
        int maxInputVal = 30;
        Random rnd = new Random();

        int arrSize = 20;
        int [] nums = new int[arrSize];

        //заполнение массива и вывод массива
        System.out.println("Сформированный массив из "+ arrSize + " элементов: ");
        for (int i=0; i<nums.length; i++){
            nums[i]=rnd.nextInt(maxInputVal);
            System.out.print(nums[i]+"\t");
        }
        //поиск минимального числа в массиве
        int minVal = nums[0];
        for (int i=0; i<nums.length; i++){
                if (nums[i]<minVal){minVal=nums[i];}
        }
        System.out.println("\n"+ "Наименьший элемент массива: " + minVal);
        //вывод всех индексов массива с наименьшим значением
        System.out.print("Индексы массива с наимешьшим элементом: ");
        for (int i=0; i<nums.length; i++){
            if (nums[i]==minVal){
                System.out.print(i+"\t");}
        }
    }
}
