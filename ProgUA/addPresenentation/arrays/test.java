package ProgUA.addPresenentation.arrays;
import ProgUA.ArrClass;

public class test {
    public static void main(String[] args) {
        int [] arr = new int [16];
        ArrClass.printArr(task1(arr));
    }


    private static int[] task1(int[] a) {
        final int len = a.length;
        int t;
        for (int i = 0; i < len / 2; i++) {
            t = a[i];
            a[i] = a[len - i - 1];
            a[len - i - 1] = t;
        }
        return a;
    }

}
