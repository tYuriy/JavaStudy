package ProgUA.addPresenentation.arrays;

import java.util.Scanner;
import java.util.Arrays;
/*
* 8*. С помощью консоли пользователь вводит
математическое выражение типа “1+33-4*7”. Написать
программу для подсчета его значения. Приоритет
операций не учитывается.
*/

public class CalculatorV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //Массив со арифметическими операторами
        char [] signArr = {'+','-','*','/'};
        //массив с позициями операторов
        int [] calcPos = new int [str.length()];
        //массив с операторами
        char [] calcSign =  new char [str.length()];
        //переменная для переопределения массива
        int k=0;

        //цикл для поиска в строке операторов
        //посимвольный перебор строки
        for (int i=0; i<str.length(); i++){
            //перебор массива операторов
            for (int j=0; j<signArr.length; j++){
                //поиск повторений и заполнение массивов с операторами
                if (str.charAt(i)==signArr[j]){
//                    System.out.println(i + " " + j + " " + signArr[j]);
                    calcPos [k]= str.indexOf(str.charAt(i));
                    calcSign [k] = signArr[j];
                    k++;
                }
            }
        }
        //изменение размера и заполнение массива существующими данными
        calcPos = Arrays.copyOf(calcPos,k);
        calcSign = Arrays.copyOf(calcSign,k);

//        ArrClass.printArr(calcPos);
//        ArrClass.printArr(calcSign);
        //переменные для обозначения чисел, над которыми проводятся действия
        int firstNum;
        int secNum = 0;
        //начальные и конечные позиции этих чисел в исходной строке
        int sPosFirstNum=0;
        int lPosFirstNum=calcPos[0];
        int sPosSecNum;
        int lPosSecNum;
//        String num = "";

        System.out.println();

        //инициализация первого числа
        firstNum = Integer.parseInt(str.substring(sPosFirstNum,lPosFirstNum));

        //       System.out.println(firstNum);
        //       System.out.println(secNum);

        //перебор инициализация и выполнения последующих чисел и действий над ними
        for (int i=0; i<calcPos.length; i++){
            //System.out.println(doCalc(firstNum,secNum,calcSign[i]));
//            System.out.println("firstNum = " + firstNum);
            sPosSecNum = calcPos[i]+1;
            if (i+1>calcPos.length-1){
                lPosSecNum = str.length();
            } else {lPosSecNum = calcPos[i+1];}

            secNum = Integer.parseInt(str.substring(sPosSecNum,lPosSecNum));
//            System.out.println("secNum = " +  secNum);
            firstNum = doCalc(firstNum,secNum,calcSign[i]);
        }
        System.out.println(firstNum);

    }
    public static int doCalc (int a, int b, char c){
        int d = 0;
        switch (c){
            case '+': d=a+b;
                break;
            case '-': d=a-b;
                break;
            case '*': d=a*b;
                break;
            case '/': d=a/b;
                break;
        }
        return d;
    }
}