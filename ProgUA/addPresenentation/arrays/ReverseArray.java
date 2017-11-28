package ProgUA.addPresenentation.arrays;

import java.util.Random;

public class ReverseArray {
    public static void main(String[] args) {
        int size = 5;
        int maxVal =10;
        int [] arr = new int[size];
        fillArray(arr,size,maxVal);
        printArr(arr);
        reverseArray(arr);
        printArr(arr);
    }
    static int [] fillArray (int[] arr, int size, int maxVal){
        Random rnd = new Random();
        for (int i=0; i<size; i++){
            arr[i]=rnd.nextInt(maxVal);
        }
        return arr;
    }
    static void reverseArray (int[] arr) {
        int a=0;
        int b=0;
        for (int i=0; i<arr.length/2; i++){
            a=arr[i];
            b=arr[arr.length-1-i];
            arr[i]=b;
            arr[arr.length-1-i]=a;
        }
    }
    static void printArr (int [] arr){
        for (int s: arr){
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}
