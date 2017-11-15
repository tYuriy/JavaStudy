package ProgUA.Java01Start.homeWork.lesson07;

import java.util.Arrays;

public class SeeAnyArray {
    public static void main(String[] args) {
        int [] intArr = {3,5,6,12};
        char [] charArr = {'a', 'X','#'};
        String [] strArr = {"string", "words", "too many words"};

        printArray(intArr);
        printArray(charArr);
        printArray(strArr);
    }
    static void printArray (int[] arr){
        System.out.println("Массив чисел: " + Arrays.toString(arr));
    }
    static void printArray (char[] arr){
        System.out.println("Массив чисел: " + Arrays.toString(arr));
    }
    static void printArray (String[] arr){
        System.out.println("Массив чисел: " + Arrays.toString(arr));
    }
}
