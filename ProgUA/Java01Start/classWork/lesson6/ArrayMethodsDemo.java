package Java01Start.classWork.lesson6;

import java.util.Arrays;

public class ArrayMethodsDemo {
    public static void main(String[] args){
        int[] A={10,3,7,11,2,5}; // Исходный массив
        int[] B=Arrays.copyOf(A,A.length); // Копия массива
        // Отображение массивов:
        System.out.println("A: "+Arrays.toString(A));
        System.out.println("B: "+Arrays.toString(B));
        // Сравнение массивов:
        System.out.println("A==B: "+Arrays.equals(A,B));
        Arrays.sort(B); // Сортировка массива
        System.out.println("A: "+Arrays.toString(A));
        System.out.println("B: "+Arrays.toString(B));
        System.out.println("A==B: "+Arrays.equals(A,B));
        Arrays.fill(B,2,4,0); // Заполнение части массива
        System.out.println("B: "+Arrays.toString(B));
        int [] C=Arrays.copyOfRange(A,1,4); // Копия части массива
        System.out.println("C: "+Arrays.toString(C));
        int[] D=new int[4]; // Новый массив
        System.arraycopy(B,1,D,0,C.length); // Копия части массива
        System.out.println("D: "+Arrays.toString(D));
    }
}
