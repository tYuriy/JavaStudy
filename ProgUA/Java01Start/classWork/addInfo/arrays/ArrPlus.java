package ProgUA.Java01Start.classWork.addInfo.arrays;

import java.util.Arrays;

public class ArrPlus {
    public static void main(String[] args) {
        int[] a = new int[100];
        Arrays.fill(a, 50); // [50, 50, … , 50]
        Arrays.sort(a);
        Arrays.sort(a, 50, 60);
        int[] x = {1,2,3,4}, y = {1,2,3,4}, z = {5,6,7};
        System.out.println(Arrays.equals(x, y)); // true
        System.out.println(Arrays.equals(x, z)); // false
        int n = Arrays.binarySearch(x, 3); // 2
        String s = Arrays.toString(a);
        System.out.println(s);
    }
}
