package ProgUA.Java01Start.homeWork.addMethods;

/*
Напишите программу с перегруженным статическим методом.
Если аргументом методу передается два целых числа, то результатом возвращается ссылка на целочисленный массив,
состоящий из натуральных чисел, а первое и последнее число в массиве определяется аргументами метода.
Например, если передать аргументами числа 2 и 4, то результатом будет массив из чисел 2, 3 и 4.
Если аргументами методу передаются два символьных значения, то результатом возвращается ссылка на массив,
состоящий из последовательности символов, а первый и последовательный символы определяются аргументами метода.
Например, если передать аргументами методу символы 'B' и 'D',
то в результате получим массив из символов 'B', 'C' и 'D'.
 */
public class OverloadStaticMethod {
    public static void main(String[] args) {

        printArray(fillIntArr(4,9));
        System.out.println("\n");
        printArray(fillIntArr('A','a'));
    }
    static int[] fillIntArr (int a, int b){
        int [] nums = new int[b-a+1];
        for (int i=0; i<nums.length; i++){
            nums[i]=a+i;
        }
        return nums;
    }
    static char[] fillIntArr (char a, char b){
        char [] chars = new char[b-a+1];
        for (int i=0; i<chars.length; i++){
            chars[i]=(char) (a+i);
        }
        return chars;
    }
    static void printArray (int [] nums){
        System.out.println("Вывод целочисленного массива: ");
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+"\t");
        }
    }
    static void printArray (char [] nums){
        System.out.println("Вывод символьного массива: ");
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+"\t");
        }
    }
}
