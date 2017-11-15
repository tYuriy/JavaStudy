package Java01Start.classWork.lesson7;

import java.util.Arrays;

public class ArgsPassDemo {
    // Первый метод:
    static void alpha(int n){
        System.out.println("В методе alpha(). На входе: "+n);
        n++;
        System.out.println("В методе alpha(). На выходе: "+n);
    }
    // Второй метод:
    static void bravo(int[] n){
        String txt=Arrays.toString(n);
        System.out.println("В методе bravo(). На входе: "+txt);
        for(int k=0;k<n.length;k++){
            n[k]++;
        }
        txt=Arrays.toString(n);
        System.out.println("В методе bravo(). На выходе: "+txt);
    }
    // Третий метод:
    static void charlie(int[] n){
        String txt=Arrays.toString(n);
        System.out.println("В методе charlie(). На входе: "+txt);
        int[] m=new int[n.length];
        for(int k=0;k<n.length;k++){
            m[k]=n[k]+1;
        }
        n=m;
        txt=Arrays.toString(n);
        System.out.println("В методе charlie(). На выходе: "+txt);
    }
    // Главный метод:
    public static void main(String[] args){
        int A=100; // Переменная для передачи аргументом
        System.out.println("До вызова метода alpha(): A="+A);
        alpha(A);
        System.out.println("После вызова метода alpha: A="+A);
        int[] B={1,3,5}; // Массив для передачи аргументом
        System.out.println("До вызова метода bravo(): B="+ Arrays.toString(B));
        bravo(B);
        System.out.println("После вызова метода bravo(): B="+Arrays.toString(B));
        int[] C={11,12,13}; // Массив для передачи аргументом
        System.out.println("До вызова метода charlie(): C="+Arrays.toString(C));
        charlie(C);
        System.out.println("После вызова метода charlie(): C="+Arrays.toString(C));
    }
}
