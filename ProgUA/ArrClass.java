package ProgUA;

import java.util.Random;

public class ArrClass {
    public static void printArr (int [] arr){
        for (int s: arr){
            System.out.print(s + "\t");
        }
        System.out.println();
    }
    public static void printArr (char [] arr){
        for (char s: arr){
            System.out.print(s + "\t");
        }
        System.out.println();
    }
    public static int [] fillArray (int size, int maxVal){
        int [] arr = new int[size];
        Random rnd = new Random();
        for (int i=0; i<size; i++){
            arr[i]=rnd.nextInt(maxVal);
        }
        return arr;
    }
}
