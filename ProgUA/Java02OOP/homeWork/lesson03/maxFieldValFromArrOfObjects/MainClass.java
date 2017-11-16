package ProgUA.Java02OOP.homeWork.lesson03.maxFieldValFromArrOfObjects;

import java.util.Random;
/*
Напишите программу с классом, в котором есть целочисленное поле.
Создайте массив таких объектов. Поля объектов заполните случайными числами.
Опишите статический метод, который в массиве объектов находит
объект с наибольшим значением поля и возвращает результатом текст
с указанием индекса объекта и значения его поля. (Java_OOP_01 с.61)
 */
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
            System.out.print(s.getX() + "\t");
            if (s.getX()>maxVal) maxVal=s.getX();
        }
        System.out.println();
        return maxVal;
    }
}
