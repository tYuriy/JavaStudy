package ProgUA.Java01Start.homeWork.addMethods;

/*
Напишите программу со статическим методом,
аргументом которому передается произвольное количество целочисленных аргументов.
Результатом метод возвращает массив из двух элементов:
это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
 */
public class MinMaxArray {
    public static void main(String[] args) {
        int [] arr = searchMinMaxVal(5,45,6,12,3,11,954,0,17,25,-7);;
        int a = arr[0];
        int b = arr[1];
        System.out.println("Минимальный элемент массива = " + a);
        System.out.println("Максимальный элемент массива = " + b);
    }
    static int[] searchMinMaxVal (int ... nums){
        int [] arr = new int[2];
        int minVal = nums[0];
        int maxVal = nums[0];
        for (int i=0; i<nums.length; i++){
            if (nums[i]<minVal) {minVal=nums[i];}
            if (nums[i]>maxVal) {maxVal=nums[i];}
        }
        arr[0]=minVal;
        arr[1]=maxVal;
        return arr;
    }
}
