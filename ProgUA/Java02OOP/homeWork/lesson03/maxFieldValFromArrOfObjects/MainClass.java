package ProgUA.Java02OOP.homeWork.lesson03.maxFieldValFromArrOfObjects;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        int n = 15;
        int m = 100;
        IntFieldClass[]  ifcArr = new IntFieldClass[n];
        Random rnd = new Random();
        for (int i=0; i<n; i++){
            ifcArr[i]=new IntFieldClass(rnd.nextInt(m));
        }
        System.out.println(maxSearch(ifcArr));
    }
    public static int maxSearch (IntFieldClass[] a){
        int maxVal = 0;
        for (IntFieldClass s : a){
            System.out.print(s.x + "\t");
            if (s.x>maxVal) maxVal=s.x;
        }
        System.out.println();
        return maxVal;
    }
}
