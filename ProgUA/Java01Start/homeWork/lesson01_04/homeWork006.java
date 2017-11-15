package ProgUA.Java01Start.homeWork.lesson01_04;

public class homeWork006 {
    public static void main(String[] args) {
        /*Напишите программу, которая вычисляет сумму квадратов натуральных чисел:*/

        int n = 20;
        int rez=0;
        int i;

        for (i=1;i<=n;i++){
            rez += i*i;
        }
        System.out.println(rez);

        rez=0;
        i=1;

        do {
            rez += i*i;
            i++;
        } while (i<=n);
        System.out.println(rez);

        rez=0;
        i=1;

        while (i<=n){
            rez += i*i;
            i++;}
        System.out.println(rez);
    }
}