package ProgUA.Java01Start.classWork.lesson5;

import java.util.Random;

public class CharArrayDemo {
    public static void main(String[] args){
        Random rnd=new Random();
        int n=28,k;
        // Создание массива:
        char[] a=new char[n];
        for(k=0;k<a.length;k++){
            // Присваивание значения элементу массива:
            a[k]=(char)('a'+rnd.nextInt(28));
            // Отображение значения элемента массива:
            System.out.print("| "+a[k]+" ");
        }
        System.out.println("|");
        // Массив случайного размера:
        char[] b=new char[rnd.nextInt(32)+32];
        // Значение первого элемента:
        b[0]='a';
        System.out.print("| "+b[0]+" | ");

        for(k=1;k<b.length;k++){
            // Присваивание значения элементу массива:
            b[k]=(char)(b[k-1]+1);
            // Отображение значения элемента:
            System.out.print(b[k]+" | ");
        }
        System.out.println("");
        }
}
