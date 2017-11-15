package ProgUA.Java01Start.homeWork.addMethods;

/*
Напишите программу со статическим методом,
которому передается целочисленный массив и произвольное количество целочисленных аргументов.
Результатом возвращается ссылка на массив,
который получается добавлением в конец исходного массива (переданного аргументом) числовых значений,
переданных аргументами методу.
 */
public class AddDataToArray {
    public static void main(String[] args) {
        int [] someIntArray = new int[]{12,71,14,48};
        printArray(addData(someIntArray, 11,22,33,44,55,66,77,88,99));
    }
    static int[] addData (int [] nums, int ... addNums){
        int [] newNums = new int[nums.length+addNums.length];
        int j=0;
        for (int i=0; i<newNums.length; i++){
            if (i<nums.length){
                newNums[i] = nums[i];
            } else {
                newNums[i] = addNums[j];
                j++;
            }
        }
        return newNums;
    }
    static void printArray (int [] nums){
        System.out.println("Вывод целочисленного массива: ");
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+"\t");
        }
    }
}
